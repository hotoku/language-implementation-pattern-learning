package info.hotoku.list;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ListLexerTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ListLexerTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ListLexerTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void test1() {
        String line = "[a, bcd ]   ";
        ListLexer lexer = new ListLexer(line);
        Token token = lexer.nextToken();
        assertEquals(ListLexer.LBRACK, token.type);
        assertEquals("[", token.value);
        token = lexer.nextToken();
        assertEquals(ListLexer.NAME, token.type);
        assertEquals("a", token.value);
        token = lexer.nextToken();
        assertEquals(ListLexer.COMMA, token.type);
        assertEquals(",", token.value);
        token = lexer.nextToken();
        assertEquals(ListLexer.NAME, token.type);
        assertEquals("bcd", token.value);
        token = lexer.nextToken();
        assertEquals(ListLexer.RBRACK, token.type);
        assertEquals("]", token.value);
        token = lexer.nextToken();
        assertEquals(ListLexer.EOF_TYPE, token.type);
    }
}
