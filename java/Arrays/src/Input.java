import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* int[] arr = new int[4];
        for (int i =0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int j : arr) {
            System.out.println(j + " "); // here mun represents the elements of the array
        }*/

        // easy and the best way to print an array
        // System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
