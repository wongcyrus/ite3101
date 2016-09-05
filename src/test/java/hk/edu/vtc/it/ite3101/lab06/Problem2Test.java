package hk.edu.vtc.it.ite3101.lab06;

import org.junit.Test;


public class Problem2Test extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void case1() {
        String keyboardInput = "0\n1\n-1\n";
        String expected = "entera:enterb:enterc:thisisnotaquadraticequation.";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

    @Test
    public void case2() {
        String keyboardInput = "1\n0\n-1\n";
        String expected = "entera:enterb:enterc:discriminant=4.0000002roots,x1=1.000000,x2=-1.000000";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

    @Test
    public void case3() {
        String keyboardInput = "1\n-1\n0\n";
        String expected = "entera:enterb:enterc:discriminant=1.0000002roots,x1=1.000000,x2=0.000000";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

    @Test
    public void case4() {
        String keyboardInput = "1\n-2\n1\n";
        String expected = "entera:enterb:enterc:discriminant=0.0000001root,x=1.000000";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

    @Test
    public void case5() {
        String keyboardInput = "1\n1\n1\n";
        String expected = "entera:enterb:enterc:discriminant=-3.000000noroots";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

    @Test
    public void case6() {
        String keyboardInput = "3\n-4\n1\n";
        String expected = "entera:enterb:enterc:discriminant=4.0000002roots,x1=1.000000,x2=0.333333";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

}