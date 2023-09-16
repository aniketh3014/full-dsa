public class Searchinarange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 234, 44, 435, -1, 34};
        int target = 234;
        int start = 3;
        int end = 6;
       boolean ans = search(arr, target, start, end);
        System.out.println(ans);
    }
    static boolean search(int[] arr,int target, int start, int end) {
        for (int indexi = start; indexi <= end; indexi++) {
            if (arr[indexi] == target) {
                return true;
            }
        }
        return false;
    }
}
