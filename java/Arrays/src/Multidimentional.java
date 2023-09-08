import java.util.Arrays;
import java.util.Scanner;

public class Multidimentional {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new  int[3][3];
        /*int[][] arr = {
                {1, 2, 3}, //0th index
                 {4, 5},
                {7, 8, 9}
        };*/
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
