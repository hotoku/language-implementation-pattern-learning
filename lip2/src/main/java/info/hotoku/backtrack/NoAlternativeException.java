package info.hotoku.backtrack;

public class NoAlternativeException extends ParseFailure {
    public char character;

    public NoAlternativeException() {
        super("No Alternative is matched");
    }
}
