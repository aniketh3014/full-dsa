public class floorOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 123, 343, 564, 896};
        int target = 345;
        int ans = floor(arr, target);
        System.out.println(arr[ans]);
    }
    static int floor(int[] arr, int target) {
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
