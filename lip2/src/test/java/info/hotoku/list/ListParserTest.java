package info.hotoku.list;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ListParserTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ListParserTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ListParserTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void test1() {
        String line = "[a, bcd]";
        ListLexer lexer = new ListLexer(line);
        ListParser parser = new ListParser(lexer);
        try {
            parser.list();
        } catch (UnexpectedToken e) {
            assertTrue("never comes here", false);
        }
    }

    public void test2() {
        String line = "[a,]";
        ListLexer lexer = new ListLexer(line);
        ListParser parser = new ListParser(lexer);
        try {
            parser.list();
            assertTrue("never comes here", false);
        } catch (UnexpectedToken e) {
            assertEquals(ListLexer.LBRACK, e.expected);
            assertEquals(ListLexer.RBRACK, e.actual);
        }
    }

}
