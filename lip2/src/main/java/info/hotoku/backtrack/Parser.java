package info.hotoku.backtrack;

import java.util.ArrayList;

public class Parser {
    Lexer lexer;
    ArrayList<Token> buf;
    ArrayList<Integer> stack;
    int p;

    public Parser(Lexer l) throws ParseFailure {
        lexer = l;
        buf = new ArrayList<Token>();
        stack = new ArrayList<Integer>();
        p = 0;
        sync(1);
    }

    private void sync(int n) throws ParseFailure {
        for (int i = 0; i < n; i++) {
            buf.add(lexer.nextToken());
        }
    }

    private void consume() throws ParseFailure {
        p++;
        if (p == buf.size() && !is_speculating()) {
            p = 0;
            buf.clear();
        }
        sync(1);
    }

    private boolean is_speculating() {
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

    private void list() throws ParseFailure {
        match(Lexer.LBRACK);
        elements();
        match(Lexer.RBRACK);
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
