package hk.edu.vtc.it.ite3101;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;

abstract public class TestBase {
    protected String lineSeperator = System.getProperty("line.separator");
    private ByteArrayOutputStream outContent;
    private PrintStream stdout;
    private InputStream stdin;

    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        stdout = System.out;
        stdin = System.in;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(stdout);
        System.setIn(stdin);
    }

    protected void testMainLogic(String expected, String keyboardInput, Consumer<String[]> mainFunc) {
        stdout.println("Test the first test for " + keyboardInput);
        ByteArrayInputStream in = new ByteArrayInputStream(keyboardInput.getBytes());
        System.setIn(in);
        //mainFunc(null);
        mainFunc.accept(null);
        //MinimumCoins.main(null);
        assertEquals(expected.replaceAll("\\s", "").toLowerCase(),
                outContent.toString().replaceAll("\\s", "").toLowerCase());

        //System.setOut(stdout);
        stdout.println("Passed the test with " + keyboardInput);
    }
}
