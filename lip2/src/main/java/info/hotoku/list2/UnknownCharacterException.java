package info.hotoku.list2;

public class UnknownCharacterException extends Exception {
    public char character;

    public UnknownCharacterException(char c) {
        this.character = c;
    }
}
