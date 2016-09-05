package hk.edu.vtc.it.ite3101.lab06;

import org.junit.Test;

public class Problem1Test extends hk.edu.vtc.it.ite3101.TestBase {

    @Test
    public void case1() {
        String keyboardInput = "8\n12\n2\n2\n";
        String expected = "enterpaperwidth:enterpaperlength:enterphotowidth:enterphotolength:portraitarrangementisbetter.themaximumnumberofphotoscanbeprintedis24.";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

    @Test
    public void case2() {
        String keyboardInput = "8\n12\n3\n3\n";
        String expected = "enterpaperwidth:enterpaperlength:enterphotowidth:enterphotolength:portraitarrangementisbetter.themaximumnumberofphotoscanbeprintedis8.";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

    @Test
    public void case3() {
        String keyboardInput = "8\n12\n2\n3\n";
        String expected = "enterpaperwidth:enterpaperlength:enterphotowidth:enterphotolength:portraitarrangementisbetter.themaximumnumberofphotoscanbeprintedis16.";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

    @Test
    public void case4() {
        String keyboardInput = "16\n20\n4.5\n6\n";
        String expected = "enterpaperwidth:enterpaperlength:enterphotowidth:enterphotolength:portraitarrangementisbetter.themaximumnumberofphotoscanbeprintedis9.";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

    @Test
    public void case5() {
        String keyboardInput = "8.27\n11.69\n1.5\n2.0\n";
        String expected = "enterpaperwidth:enterpaperlength:enterphotowidth:enterphotolength:landscapearrangementisbetter.themaximumnumberofphotoscanbeprintedis28.";
        testMainLogic(expected, keyboardInput, x -> Problem1.main(x));
    }

}