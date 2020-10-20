package info.hotoku.list2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LexerTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LexerTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(LexerTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void test1() {
        String line = "[a, bcd ]   ";
        Lexer lexer = new Lexer(line);
        try {
            Token token = lexer.nextToken();
            assertEquals(Lexer.LBRACK, token.type);
            assertEquals("[", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.NAME, token.type);
            assertEquals("a", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.COMMA, token.type);
            assertEquals(",", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.NAME, token.type);
            assertEquals("bcd", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.RBRACK, token.type);
            assertEquals("]", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.EOF_TYPE, token.type);
        } catch (UnknownCharacterException e) {
            assertTrue("never come here", false);
        }
    }

    public void test2() {
        String line = "[a,]";
        Lexer lexer = new Lexer(line);
        try {
            Token token = lexer.nextToken();
            assertEquals(Lexer.LBRACK, token.type);
            assertEquals("[", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.NAME, token.type);
            assertEquals("a", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.COMMA, token.type);
            assertEquals(",", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.RBRACK, token.type);
            assertEquals("]", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.EOF_TYPE, token.type);
        } catch (UnknownCharacterException e) {
            assertTrue("never come here", false);
        }
    }

    public void test3() {
        String line = "[a=b]";
        Lexer lexer = new Lexer(line);
        try {
            Token token = lexer.nextToken();
            assertEquals(Lexer.LBRACK, token.type);
            assertEquals("[", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.NAME, token.type);
            assertEquals("a", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.EQUAL, token.type);
            assertEquals("=", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.NAME, token.type);
            assertEquals("b", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.RBRACK, token.type);
            assertEquals("]", token.value);
            token = lexer.nextToken();
            assertEquals(Lexer.EOF_TYPE, token.type);
        } catch (UnknownCharacterException e) {
            assertTrue("never come here", false);
        }
    }

}
