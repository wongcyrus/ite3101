package hk.edu.vtc.it.ite3101.lab04;

import org.junit.Test;

public class Problem1Test extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void test_1_2() {
        String keyboardInput = "1\n2\n";
        String expected = "entertheradius:enterthelength:thevolumeofthecylinderwithradius=1.0andlength=2.0is6.283185307179586.";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

    @Test
    public void test_3_4() {
        String keyboardInput = "3\n4\n";
        String expected = "entertheradius:enterthelength:thevolumeofthecylinderwithradius=3.0andlength=4.0is113.09733552923255.";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

}