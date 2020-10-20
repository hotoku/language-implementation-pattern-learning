package info.hotoku.list2;

public class Lexer {
    public static char EOF = (char) -1;
    public static int EOF_TYPE = 1;
    public static int LBRACK = 2;
    public static int RBRACK = 3;
    public static int NAME = 4;
    public static int COMMA = 5;
    public static int EQUAL = 6;

    char c;
    int pos;
    String line;

    public Lexer(String line) {
        pos = 0;
        c = line.charAt(pos);
        this.line = line;
    }

    public Token nextToken() throws UnknownCharacterException {
        while (ws()) {
            consume();
        }
        if (c == EOF) {
            return eof();
        }
        if (c == '[') {
            consume();
            return new Token(LBRACK, "[");
        }
        if (c == ']') {
            consume();
            return new Token(RBRACK, "]");
        }
        if (c == ',') {
            consume();
            return new Token(COMMA, ",");
        }
        if (c == '=') {
            consume();
            return new Token(EQUAL, "=");
        }
        if (letter()) {
            return name();
        }
        throw new UnknownCharacterException(c);
    }

    void consume() {
        pos++;
        if (pos == line.length()) {
            c = EOF;
        } else {
            c = line.charAt(pos);
        }

    }

    Token name() {
        String ret = "";
        while (letter()) {
            ret += c;
            consume();
        }
        return new Token(NAME, ret);
    }

    Token eof() {
        return new Token(EOF_TYPE, new String(""));
    }

    boolean ws() {
        return c == ' ' || c == '\t' || c == '\n';
    }

    boolean letter() {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }

    public static String tokenName(int type) {
        switch (type) {
            case 1:
                return "EOF_TYPE";
            case 2:
                return "LBRACK";
            case 3:
                return "RBRACK";
            case 4:
                return "NAME";
            case 5:
                return "COMMA";
            case 6:
                return "EQUAL";
        }
        return "unknown";
    }
}
