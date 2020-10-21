package info.hotoku.list2;

public class UnexpectedToken extends Exception {
    public int expected;
    public Token actual;
    public String msg;

    public UnexpectedToken(int expected, Token actual) {
        this.expected = expected;
        this.actual = actual;
    }

    public UnexpectedToken(String msg, Token actual) {
        this.msg = msg;
        this.actual = actual;
    }
}
