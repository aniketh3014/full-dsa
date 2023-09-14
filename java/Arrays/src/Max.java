public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3, 4, 5, 6, 7};
        System.out.println(maxinRange(arr, 1, 3));
    }

    // finding a maximum value in a range
    static int maxinRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxval = arr[start];
        for (int i = 0; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
