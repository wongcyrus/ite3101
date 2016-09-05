package hk.edu.vtc.it.ite3101.lab09;

public class Q2d {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++)
            System.out.println("The day is " +
                    dayOfWeek(i) + ".");
    }

    public static String dayOfWeek(int n) {
        final String WEEKDAY_NAME = "SunMonTueWedThuFriSat";
        int position;
        position = 3 * (n - 1);
        return WEEKDAY_NAME.substring(position, position + 3);
    }

}
