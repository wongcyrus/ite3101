package hk.edu.vtc.it.ite3101.lab08;

import org.junit.Test;


public class Problem1Test extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void test() {
        String keyboardInput = "\n";
        String expected = "0123456789+------------------------------0|00000000001|01234567892|0246810121416183|03691215182124274|048121620242832365|0510152025303540456|0612182430364248547|0714212835424956638|0816243240485664729|091827364554637281";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

}