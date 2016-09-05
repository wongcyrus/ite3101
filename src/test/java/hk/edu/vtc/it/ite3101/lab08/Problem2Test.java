package hk.edu.vtc.it.ite3101.lab08;

import org.junit.Test;

public class Problem2Test extends hk.edu.vtc.it.ite3101.TestBase {
    @Test
    public void case1() {
        String keyboardInput = "1.23\n2.05\n4.0\n0.01\n0.12\n-1\n";
        String expected = "enteranumber(-vetofinish):enteranumber(-vetofinish):enteranumber(-vetofinish):enteranumber(-vetofinish):enteranumber(-vetofinish):enteranumber(-vetofinish):n=5" +
                "sum=7.41" +
                "mean=1.48" +
                "maximum=4.00" +
                "minimum=0.01" +
                "standarddeviation=1.64";
        testMainLogic(expected, keyboardInput, x -> Problem2.main(x));
    }

}