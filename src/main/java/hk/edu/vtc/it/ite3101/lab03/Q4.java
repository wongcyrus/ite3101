package hk.edu.vtc.it.ite3101.lab03;

public class Q4 {
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
    }

    private static void d() {
        System.out.println("The price is " + 30 + " dollars and " + 60 + " cents.");
    }

    private static void c() {
        double var1 = 3;
        System.out.println(var1 + 5);
    }

    private static void b() {
        System.out.println("act" + "ion");
    }

    private static void a() {
        String var;
        var = "Programming";
        System.out.print(var);
        var = "Networking";
        System.out.println(var);
    }
}
