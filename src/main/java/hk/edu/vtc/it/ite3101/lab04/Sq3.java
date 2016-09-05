package hk.edu.vtc.it.ite3101.lab04;

/**
 * Created by developer on 9/3/2016.
 */
public class Sq3 {
    public static void main(String[] args) {

        System.out.printf("[%d] [%d] [%d]\n", 10, 0, -10);
        System.out.printf("[%10d] [%10d] [%10d]\n", 10, 0, -10);
        System.out.printf("[%010d] [%010d] [%010d]\n", 10, 0, -10);
        System.out.printf("[%4x] [%4X] [%04X]\n", 10, 16, 0xFFFF);
        System.out.printf("[%f] [%f]\n", Math.PI, -Math.PI);
        System.out.printf("[%e] [%e]\n", Math.PI, -Math.PI);
        System.out.printf("[%10.8f] [%10.8f]\n", Math.PI, -Math.PI);
        System.out.printf("[%10.8e] [%10.8e]\n", Math.PI, -Math.PI);
        System.out.printf("[%c] [%5c] [%5c]\n", 'a', 65, 'x' + 1);
        System.out.printf("[%s %s %.10S!]\n", "Welcome", "to", "ive");
        System.out.printf("[%s %s %10S!]\n", "Welcome", "to", "ive");

    }

}
