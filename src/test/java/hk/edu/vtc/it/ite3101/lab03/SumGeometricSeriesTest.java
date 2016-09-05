package hk.edu.vtc.it.ite3101.lab03;

import org.junit.Test;

public class SumGeometricSeriesTest extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void test_2_3_4() {
        String keyboardInput = "2\n3\n4\n";
        String expected = "Enter a : Enter R : Enter n : Sq=80.0" + lineSeperator;
        testMainLogic(expected, keyboardInput, x -> SumGeometricSeries.main(x));
    }

    @Test
    public void test_3_5_5() {
        String keyboardInput = "3\n5\n5\n";
        String expected = "Enter a : Enter R : Enter n : Sq=2343.0" + lineSeperator;
        testMainLogic(expected, keyboardInput, x -> SumGeometricSeries.main(x));
    }

}