package hk.edu.vtc.it.ite3101.lab03;

import org.junit.Test;

public class MinimumCoinsTest extends hk.edu.vtc.it.ite3101.TestBase {

    @Test
    public void case38() {
        String keyboardInput = "38\n";
        String expected = "Input an amount: The minimum numbers of coins for 38 dollars are:" + lineSeperator +
                "3 10-dollar coin(s)" + lineSeperator +
                "1 5-dollar coin(s)" + lineSeperator +
                "1 2-dollar coin(s)" + lineSeperator +
                "1 1-dollar coin(s)" + lineSeperator;
        testMainLogic(expected, keyboardInput, x -> MinimumCoins.main(x));
    }

    @Test
    public void case19() {
        String keyboardInput = "19\n";
        String expected = "Input an amount: The minimum numbers of coins for 19 dollars are:" + lineSeperator +
                "1 10-dollar coin(s)" + lineSeperator +
                "1 5-dollar coin(s)" + lineSeperator +
                "2 2-dollar coin(s)" + lineSeperator +
                "0 1-dollar coin(s)" + lineSeperator;

        testMainLogic(expected, keyboardInput, x -> MinimumCoins.main(x));
    }

    @Test
    public void case77() {
        String keyboardInput = "77\n";
        String expected = "Input an amount: The minimum numbers of coins for 77 dollars are:" + lineSeperator +
                "7 10-dollar coin(s)" + lineSeperator +
                "1 5-dollar coin(s)" + lineSeperator +
                "1 2-dollar coin(s)" + lineSeperator +
                "0 1-dollar coin(s)" + lineSeperator;

        testMainLogic(expected, keyboardInput, x -> MinimumCoins.main(x));
    }


}