package info.hotoku.backtrack;

public class UnknownCharacterException extends ParseFailure {
    public UnknownCharacterException(char c) {
        super(String.format("unknown character: %s", c));
    }
}
