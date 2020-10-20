package info.hotoku.list;

public class ListParser {
    ListLexer lexer;
    Token token;

    public ListParser(ListLexer lexer) {
        this.lexer = lexer;
        this.token = this.lexer.nextToken();
    }

    void list() throws UnexpectedToken {
        match(ListLexer.LBRACK);
        element();
        while (token.type == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
        match(ListLexer.RBRACK);
    }

    void element() throws UnexpectedToken {
        if (token.type == ListLexer.NAME) {
            name();
        } else {
            list();
        }
    }

    void name() throws UnexpectedToken {
        match(ListLexer.NAME);
    }

    void match(int expected) throws UnexpectedToken {
        if (token.type != expected) {
            throw new UnexpectedToken(expected, token.type);
        }
        consume();
    }

    private void consume() {
        token = lexer.nextToken();
    }
}
