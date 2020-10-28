package info.hotoku.backtrack;

public class UnexpectedToken extends ParseFailure {
    public int expected;
    public Token actual;

    public UnexpectedToken(int expected, Token actual) {
        super(String.format("unexpected token: expected %s, actual %s", Lexer.tokenName(expected),
                Lexer.tokenName(actual.type)));
        this.expected = expected;
        this.actual = actual;
    }
}
