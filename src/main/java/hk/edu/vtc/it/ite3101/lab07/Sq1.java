package hk.edu.vtc.it.ite3101.lab07;

public class Sq1 {

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
    }

    private static void d() {
        String s1;
        for (int row = 1; row <= 5; row++) {
            s1 = "";
            for (int column = 1; column <= 5; column++) {
                s1 += (row == column) ? "*" : " ";
            }
            System.out.println(s1);
        }
    }

    private static void c() {
        int i;
        for (i = -9; i <= -1; i += 3)
            System.out.print(i + " ");

        System.out.println("");
    }

    private static void b() {
        int j = 2;
        String s = "";
        while (j <= 8) {
            s += "*";
            j += 2;
        }
        System.out.println(j + " " + s);
    }

    private static void a() {
        double balance = 1000;      // initialize to $1000
        double interestRate = 0.1;
        int years = 0;               // number of years
        do {
            balance = (1 + interestRate) * balance;
            years += 1;
        } while (balance <= 1200);
        System.out.println(years);
    }
}
