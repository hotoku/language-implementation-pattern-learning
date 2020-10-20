package info.hotoku.list;

public class UnexpectedToken extends Exception {
    public int expected;
    public int actual;

    public UnexpectedToken(int expected, int actual) {
        this.expected = expected;
        this.actual = actual;
    }
}
