package hk.edu.vtc.it.ite3101.lab03;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("a");
        a();
        System.out.println("b");
        b();
        System.out.println("c");
        c();
        System.out.println("d");
        d();
        System.out.println("e");
        e();
        System.out.println("f");
        f();
    }

    private static void f() {
        double p = 5.1, q = 2.3;
        p += p;
        System.out.println(p + q);
        System.out.println(p - q);
    }

    private static void e() {
        double x = 8;
        x += 5;
        System.out.println(x + 3 * x);
    }

    private static void d() {
        int u, v;
        u = 5;
        v = u * u;
        System.out.println(u * v);
    }

    private static void c() {
        int num = 7;
        num = 9 % num;
        System.out.println(num);
    }

    private static void b() {
        int n = 9;
        n += 1;
        System.out.println(n);
        System.out.println(n + 1);
    }

    private static void a() {
        double amount;
        amount = 20;
        System.out.println(amount - 8);
    }

}
