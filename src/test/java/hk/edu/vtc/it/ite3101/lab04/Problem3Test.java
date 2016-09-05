package hk.edu.vtc.it.ite3101.lab04;

import org.junit.Test;


public class Problem3Test extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void a_1_b_2_c_1() {
        String keyboardInput = "1\n2\n1\n";
        String expected = "entera:enterb:enterc:x1=-1.00,x2=-1.00";
        testMainLogic(expected, keyboardInput, x -> Problem3.main(x));
    }

    @Test
    public void a_1_b_6_c_3() {
        String keyboardInput = "2\n6\n3\n";
        String expected = "entera:enterb:enterc:x1=-0.63,x2=-2.37";
        testMainLogic(expected, keyboardInput, x -> Problem3.main(x));
    }

    @Test
    public void a_2_b_0_c__3() {
        String keyboardInput = "2\n0\n-3\n";
        String expected = "entera:enterb:enterc:x1=1.22,x2=-1.22";
        testMainLogic(expected, keyboardInput, x -> Problem3.main(x));
    }

}