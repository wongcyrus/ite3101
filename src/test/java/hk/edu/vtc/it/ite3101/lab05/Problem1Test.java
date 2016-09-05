package hk.edu.vtc.it.ite3101.lab05;

import org.junit.Test;


public class Problem1Test extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void test() {
        String keyboardInput = "";
        String expected = "0.00.00.00.00.00.00.00.00.00.0";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

}