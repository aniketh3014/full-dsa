public class Bs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 55, 66, 77};
        int target = 55;
        int ansIndex = search(arr, target, 0, arr.length-1);
        System.out.println(ansIndex);
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = start + (end-start)/2;

        if (arr[middle] == target) {
            return middle;
        }
        if (arr[middle] > target) {
            return search(arr, target, start, end-1);
        }

        return search(arr, target, start+1, end);
    }
}
