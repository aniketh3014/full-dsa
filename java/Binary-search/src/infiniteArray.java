public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,24,25, 27, 133, 135, 136, 167, 198, 199, 200};
        int target = 135;
        System.out.println(findRange(arr, target));
    }
    static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            // end = end + 2*boxsize
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
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
