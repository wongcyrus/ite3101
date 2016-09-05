package hk.edu.vtc.it.ite3101.lab08;

public class Sq {
    public static void main(String[] args) {
        q1a();
        q1b();

        q2();
        q3();

        q4a();
        q4b();
        q4c();
        q4d();
    }

    private static void q4d() {
        int count = 5;
        while (count < 10) {
            count = count + 3;
        }
    }

    private static void q4c() {
        int count = 5;
        while (count < 10) {
            count++;
        }
    }

    private static void q4b() {
        for (int count = 0; count <= 10; count++) {
        }
    }

    private static void q4a() {
        int count = 0;
        while (count < 10) {
            count++;
        }
    }

    private static void q3() {
        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
        }
        System.out.println();
    }

    private static void q2() {
        int i = 1;
        int sum = 0;
        while (sum < 10000) {
            sum = sum + i;
            i++;
        }
    }

    private static void q1a() {
   /*     int balance = 100;
        while (true) {
            if (balance < 12)
                break;
            balance = balance - 12;
        }
        System.out.println("Balance is " + balance);*/
    }

    private static void q1b() {
/*        int balance = 100;
        while (true) {
            if (balance < 12)
                continue;
            balance = balance – 12;
        }
        System.out.println("Balance is " + balance);*/
    }
}
