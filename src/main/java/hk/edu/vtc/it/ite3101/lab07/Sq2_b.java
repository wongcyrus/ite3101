package hk.edu.vtc.it.ite3101.lab07;

public class Sq2_b {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i--);
        } while (i >= 0);
        System.out.println("After loop, i=" + i);
    }
}
