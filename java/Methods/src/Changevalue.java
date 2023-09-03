import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 2, 3, 5, 32};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0] = 69;
    }
}
