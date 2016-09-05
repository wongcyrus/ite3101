package hk.edu.vtc.it.ite3101.lab07;

import org.junit.Test;

public class Problem2Test extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void test_2() throws Exception {
        String keyboardInput = "2\n";
        String expected = "enterx(inradians):sin(2.0)=0.9092974268256817";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

    @Test
    public void test_1() throws Exception {
        String keyboardInput = "1\n";
        String expected = "enterx(inradians):sin(1.0)=0.8414709848078965";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

}