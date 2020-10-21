package info.hotoku.list2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ParserTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ParserTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ParserTest.class);
    }

    /**
     * Rigourous Test :-)
     *
     * @throws UnknownCharacterException
     * @throws UnexpectedToken
     */
    public void test1() {
        String line = "[a, bcd]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer, 2);
            parser.list();
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        }

    }

    public void test2() {
        String line = "[a, bcd,]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer, 2);
            parser.list();
            assertTrue("never comes here", false);
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertEquals(Lexer.RBRACK, e.actual.type);
        }

    }

    public void test3() {
        String line = "[a, bcd, [a, b]]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer, 2);
            parser.list();
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        }

    }

    public void test4() {
        String line = "[a, bcd, [a, b]]]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer, 2);
            parser.list();
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        }

    }

}
