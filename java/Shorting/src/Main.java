import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 1, 23, 234, 8, 2};
        bubbleShort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleShort(int[] arr) {
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max element will come at the last index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    //swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}