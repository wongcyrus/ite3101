package hk.edu.vtc.it.ite3101.lab07;

import org.junit.Test;

public class Problem1Test extends hk.edu.vtc.it.ite3101.TestBase {

    @Test
    public void test_january() throws Exception {
        String keyboardInput = "january\n";
        String expected = "enteraword(inlowercase):'n'comesfirst";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

    @Test
    public void test_february() throws Exception {
        String keyboardInput = "february\n";
        String expected = "enteraword(inlowercase):'r'comesfirst";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

    @Test
    public void test_august() throws Exception {
        String keyboardInput = "august\n";
        String expected = "enteraword(inlowercase):no'n'or'r'";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

}