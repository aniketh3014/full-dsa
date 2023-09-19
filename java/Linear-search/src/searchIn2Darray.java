import java.util.Arrays;

public class searchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 342, 24, 243},
                {66, 55, 22},
                {11, 12, 13, 14},
                {77, 88, 99, 10}
        };
        int target = 23;
        int[] ans = search(arr, target); // returns the row and col index of the element
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
