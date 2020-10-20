package info.hotoku.list;

public class ListLexer {
    public static char EOF = (char) -1;
    public static int EOF_TYPE = 1;
    public static int LBRACK = 2;
    public static int RBRACK = 3;
    public static int NAME = 4;
    public static int COMMA = 5;

    char c;
    int pos;
    String line;

    public ListLexer(String line) {
        pos = 0;
        c = line.charAt(pos);
        this.line = line;
    }

    public Token nextToken() {
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
        return name();
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
        while (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
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
}
