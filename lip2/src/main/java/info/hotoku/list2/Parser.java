package info.hotoku.list2;

public class Parser {
    Lexer lexer;
    int k;
    Token[] buf;
    int p;

    public Parser(Lexer l, int k) throws UnknownCharacterException {
        lexer = l;
        this.k = k;
        buf = new Token[k];
        p = 0;
        for (int i = 0; i < k; i++) {
            buf[i] = lexer.nextToken();
        }
    }

    public void parse() throws UnexpectedToken, UnknownCharacterException {
        list();
        match(Lexer.EOF_TYPE);
    }

    public void list() throws UnexpectedToken, UnknownCharacterException {
        match(Lexer.LBRACK);
        elements();
        match(Lexer.RBRACK);
    }

    private void elements() throws UnexpectedToken, UnknownCharacterException {
        element();
        while (get(0).type == Lexer.COMMA) {
            match(Lexer.COMMA);
            element();
        }
    }

    private void element() throws UnexpectedToken, UnknownCharacterException {
        int t0 = get(0).type;
        int t1 = get(1).type;
        if (t0 == Lexer.LBRACK) {
            list();
            return;
        }
        if (t0 == Lexer.NAME && t1 == Lexer.EQUAL) {
            assign();
            return;
        }
        if (t0 == Lexer.NAME) {
            match(Lexer.NAME);
            return;
        }
        throw new UnexpectedToken("cannot parsed as element", get(0));
    }

    private void assign() throws UnexpectedToken, UnknownCharacterException {
        match(Lexer.NAME);
        match(Lexer.EQUAL);
        match(Lexer.NAME);
    }

    void match(int type) throws UnexpectedToken, UnknownCharacterException {
        if (get(0).type != type) {
            throw new UnexpectedToken(type, get(0));
        }
        consume();
    }

    Token get(int i) {
        assert i < k;
        return buf[(p + i) % k];
    }

    void consume() throws UnknownCharacterException {
        buf[p] = lexer.nextToken();
        p++;
        if (p >= k)
            p = 0;
    }
}
