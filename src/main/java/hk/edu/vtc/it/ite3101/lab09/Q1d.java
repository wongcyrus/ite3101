package hk.edu.vtc.it.ite3101.lab09;

public class Q1d {
    public static void main(String[] args) {
        characterType('A');
        characterType('z');
        characterType('5');
    }

    public static void characterType(char ch) {
        System.out.print("'" + ch + "' is a ");
        if ((ch >= 'A') && (ch <= 'Z'))
            System.out.println("upper-case letter.");
        else if ((ch >= 'a') && (ch <= 'z'))
            System.out.println("lower-case letter.");
        else if ((ch >= '0') && (ch <= '9'))
            System.out.println("digit.");
    }

}
