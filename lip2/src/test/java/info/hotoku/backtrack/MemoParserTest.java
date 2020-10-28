package info.hotoku.backtrack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MemoParserTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MemoParserTest(String testName) {
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
            parser = new Parser(lexer);
            parser.parse();
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            e.printStackTrace();
            assertTrue("unepected token: " + e.actual.value, false);
        } catch (NoAlternativeException e) {
        }
    }

    public void test2() {
        String line = "[a, bcd,]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer);
            parser.parse();
            assertTrue("never comes here", false);
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        } catch (NoAlternativeException e) {
        }
    }

    public void test3() {
        String line = "[a, bcd, [a, b]]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer);
            parser.parse();
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        } catch (NoAlternativeException e) {
        }
    }

    public void test4() {
        String line = "[a, bcd, [a, b]]]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer);
            parser.parse();
            assertTrue("never comes here", false);
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertEquals(Lexer.EOF_TYPE, e.expected);
            assertEquals(Lexer.RBRACK, e.actual.type);
        } catch (NoAlternativeException e) {
        }
    }

    public void test5() {
        String line = "[a]=[b]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer);
            parser.parse();
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        } catch (NoAlternativeException e) {
            assertTrue("never comes here", false);
        }
    }

    public void test6() {
        String line = "[a, b]=[b, c]";
        Lexer lexer = new Lexer(line);
        Parser parser;
        try {
            parser = new Parser(lexer);
            parser.parse();
        } catch (UnknownCharacterException e) {
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        } catch (NoAlternativeException e) {
            assertTrue("never comes here", false);
        }
    }

}
