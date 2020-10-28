package info.hotoku.backtrack;

public class ParseFailure extends Exception {
    String reason;

    public ParseFailure(String s) {
        reason = s;
    }

    String getRreason() {
        return reason;
    }
}
