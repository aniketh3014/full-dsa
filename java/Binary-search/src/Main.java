public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 2, 4, 5, 10, 12};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)  {
            //find the middle element
            //int mid = (start + end)/2; // in this case the value could exceed the range if int in java
            // so insted we can do this
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}