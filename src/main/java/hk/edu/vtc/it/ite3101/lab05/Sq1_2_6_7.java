package hk.edu.vtc.it.ite3101.lab05;

/**
 * Created by developer on 9/3/2016.
 */
public class Sq1_2_6_7 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[1] + a[4]);

        //char[] charArray = new charArray[26];
        //char charArray[] = new charArray[26];
        //int[] words = new words[100];
        //int[100]words = new int[];
        //char[] charArray = "I am a boy";
        //char[] charArray = ('a', 'b', 'c', 'd');
        //char[] charArray = {"a", "b", "c", "d"};
        //double nums[] = [10.5, 25.1, 30.05];
        //double nums[] = {-3.5, 0, 3, 20.5};

        //int[3][4]matrix;
        //  double[][] matrix;
        //  int[][] matrix = new int[3][4];
        //  int[][] matrix = {(1, 2),(3, 4),(5, 6)};
        //  int[][] matrix = {{1}, {2, 3}, {4, 5, 6}};
        //  double[][] matrix = new double[3][];
        //  double[][] matrix = new double[][ 4];
        //  int[][] matrix = new int[3][];
        //  matrix[2] = new int[4];


        q7();
    }

    private static void q7() {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7}, {8, 9}};
        System.out.println(m[0][0]);
        System.out.println(m[1][2]);
        System.out.println(m[3][3]);
        System.out.println(m[3][0] + m[2][0]);
        System.out.println(m.length);
        System.out.println(m[2].length);
    }
}
