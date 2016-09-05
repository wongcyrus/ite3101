package hk.edu.vtc.it.ite3101.lab03;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a, x;
        a = 10;
        x = a++;
        System.out.println("a=" + a);
        System.out.println("x=" + x);
        x = ++a;
        System.out.println("a=" + a);
        System.out.println("x=" + x);
    }
}