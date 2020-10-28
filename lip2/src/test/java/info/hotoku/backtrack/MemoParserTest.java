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
        return new TestSuite(MemoParserTest.class);
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
        MemoParser parser;
        try {
            parser = new MemoParser(lexer);
            parser.parse();
        } catch (ParseFailure e) {
            assertTrue("never comes here", false);
        }
    }

    public void test2() {
        String line = "[a, bcd,]";
        Lexer lexer = new Lexer(line);
        MemoParser parser;
        try {
            parser = new MemoParser(lexer);
            parser.parse();
            assertTrue("never comes here", false);
        } catch (NoAlternativeException e) {
        } catch (ParseFailure e) {
            e.printStackTrace();
            System.out.println(e.getRreason());
            assertTrue("never comes here", false);
        }
    }

    public void test3() {
        String line = "[a, bcd, [a, b]]";
        Lexer lexer = new Lexer(line);
        MemoParser parser;
        try {
            parser = new MemoParser(lexer);
            parser.parse();
        } catch (ParseFailure e) {
        }
    }

    public void test4() {
        String line = "[a, bcd, [a, b]]]";
        Lexer lexer = new Lexer(line);
        MemoParser parser;
        try {
            parser = new MemoParser(lexer);
            parser.parse();
            assertTrue("never comes here", false);
        } catch (NoAlternativeException e) {
        } catch (ParseFailure e) {
            e.printStackTrace();
            System.out.println(e.getRreason());
            assertTrue("never comes here", false);
        }
    }

    public void test5() {
        String line = "[a]=[b]";
        Lexer lexer = new Lexer(line);
        MemoParser parser;
        try {
            parser = new MemoParser(lexer);
            parser.parse();
        } catch (ParseFailure e) {
            assertTrue("never comes here", false);
        }
    }

    public void test6() {
        String line = "[a, b]=[b, c]";
        Lexer lexer = new Lexer(line);
        MemoParser parser;
        try {
            parser = new MemoParser(lexer);
            parser.parse();
        } catch (ParseFailure e) {
            assertTrue("never comes here", false);
        }
    }

}
