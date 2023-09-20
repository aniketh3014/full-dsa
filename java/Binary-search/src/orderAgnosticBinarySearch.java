public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {100, 11, 10, 8, 5, 2};
        int target = 11;
        System.out.println(orderAgSearch(arr, target));
    }
    static int orderAgSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        // find the middle element
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
