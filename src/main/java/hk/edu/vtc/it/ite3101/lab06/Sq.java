package hk.edu.vtc.it.ite3101.lab06;

/**
 * Created by developer on 9/3/2016.
 */
public class Sq {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
    }

    private static void q2() {
    /* x > y > 0;
     x = y || y;
     x /= y;
     x or y;
     x and y;
     (x != 7) || (x = 7);*/
    }

    private static void q4() {
        int x = 0;
        int a = 0;
        if (a == 1)
            x += 3;
        else if (a == 2)
            x += 5;
        else if (a == 3)
            x += 7;
        else if (a == 4)
            x += 10;

        System.out.println("x=" + x);
    }

    private static void q3() {
        int x = 4;
        int y = 4;
        switch (x + 4) {
            case 8:
                y = 1;
            default:
                y++;
        }

        System.out.println("y=" + y);
    }

    private static void q1() {
        int x = 1;
        System.out.println((true) && (4 < 3));
        System.out.println(!(x < 0) && (x < 0));
        System.out.println((x < 0) || (x > 0));
        System.out.println((x != 0) || (x == 0));
        System.out.println((x >= 0) || (x < 0));
        System.out.println((x != 0) == !(x == 0));
    }

}

