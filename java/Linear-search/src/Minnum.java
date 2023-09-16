public class Minnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 234, 44, 435, 21, 34};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int mini = arr[0];
        for (int ele : arr) {
            if (ele < mini) {
                mini = ele;
            }
        }
        return mini;
    }
}
