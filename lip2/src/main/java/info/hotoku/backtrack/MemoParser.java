package info.hotoku.backtrack;

import java.util.ArrayList;
import java.util.HashMap;

public class MemoParser {
    private static final int FAILED = -1;

    Lexer lexer;
    ArrayList<Token> buf;
    ArrayList<Integer> stack;
    int p;
    HashMap<Integer, Integer> list_memo;

    public MemoParser(Lexer l) throws ParseFailure {
        lexer = l;
        buf = new ArrayList<Token>();
        stack = new ArrayList<Integer>();
        p = 0;
        sync(1);
        list_memo = new HashMap<Integer, Integer>();
    }

    private void sync(int n) throws ParseFailure {
        for (int i = 0; i < n; i++) {
            buf.add(lexer.nextToken());
        }
    }

    private void consume() throws ParseFailure {
        p++;
        if (p == buf.size() && !isSpeculating()) {
            p = 0;
            buf.clear();
        }
        sync(1);
    }

    private boolean isSpeculating() {
        return stack.size() > 0;
    }

    public Token LT(int i) throws ParseFailure {
        if (p + i >= buf.size()) {
            int n = p + i - (buf.size() - 1);
            sync(n);
        }
        return buf.get(p + i);
    }

    public int LA(int i) throws ParseFailure {
        return LT(i).type;
    }

    private void dump() throws ParseFailure {
        for (int i = 0; i < buf.size(); i++) {
            System.out.println(String.format("buf[%d]=%s", i, buf.get(i).value));
        }
    }

    public void parse() throws ParseFailure {
        if (speculate_list()) {
            list();
            match(Lexer.EOF_TYPE);
        } else if (speculate_assign()) {
            assign();
            match(Lexer.EOF_TYPE);
        } else {
            throw new NoAlternativeException();
        }
    }

    private boolean speculate_assign() {
        boolean success = true;
        mark();
        try {
            assign();
            match(Lexer.EOF_TYPE);
        } catch (ParseFailure e) {
            success = false;
        }
        unmark();
        return success;
    }

    private boolean speculate_list() {
        System.out.println("speculate_list");
        boolean success = true;
        mark();
        try {
            list();
            match(Lexer.EOF_TYPE);
        } catch (ParseFailure e) {
            success = false;
        }
        unmark();
        return success;
    }

    private void mark() {
        stack.add(p);
    }

    private void unmark() {
        p = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
    }

    private void _list() throws ParseFailure {
        match(Lexer.LBRACK);
        elements();
        match(Lexer.RBRACK);
    }

    private void list() throws ParseFailure {
        if (!isSpeculating()) {
            System.out.println("nor speculating. actually parse list");
            _list();
            return;
        }
        Integer p2 = Integer.valueOf(p);
        if (list_memo.containsKey(p2)) {
            System.out.println(String.format("we have already parsed list at pos = %d", p));
            if (list_memo.get(p2).intValue() == FAILED) {
                throw new ParseFailure("previous parse failed");
            } else {
                p = list_memo.get(p2).intValue();
                return;
            }
        }
        System.out.println(String.format("we have not parsed list at pos = %d", p));
        boolean failed = false;
        int startPos = p;
        try {
            _list();
        } catch (ParseFailure e) {
            failed = true;
        } finally {
            if (failed) {
                list_memo.put(Integer.valueOf(startPos), Integer.valueOf(FAILED));
            } else {
                list_memo.put(Integer.valueOf(startPos), Integer.valueOf(p));
            }
        }
    }

    private boolean alreadyParsed(HashMap<Integer, Integer> list_memo2) {
        return false;
    }

    private void elements() throws ParseFailure {
        element();
        while (LA(0) == Lexer.COMMA) {
            match(Lexer.COMMA);
            element();
        }
    }

    private void element() throws ParseFailure {
        int t0 = LA(0);
        int t1 = LA(1);
        if (t0 == Lexer.LBRACK) {
            list();
            return;
        }
        if (t0 == Lexer.NAME && t1 == Lexer.EQUAL) {
            match(Lexer.NAME);
            match(Lexer.EQUAL);
            match(Lexer.NAME);
            return;
        }
        if (t0 == Lexer.NAME) {
            match(Lexer.NAME);
            return;
        }
        throw new ParseFailure(String.format("cannot parsed as element: %s", LT(0).value));
    }

    private void assign() throws ParseFailure {
        list();
        match(Lexer.EQUAL);
        list();
    }

    void match(int type) throws ParseFailure {
        if (LA(0) != type) {
            throw new UnexpectedToken(type, LT(0));
        }
        consume();
    }
}
