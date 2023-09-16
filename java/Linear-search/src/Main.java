public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 3, 43, 5, 52, -10, 23, 88, 100, 10};
        int target = -10;
        boolean ans = linearsearch(arr, target);
        System.out.println(ans);
    }
    //search in array: return the index if item found
    // otherwise if item not found return -1;
    static boolean linearsearch(int[] arr, int target) {
        // run a for loop
        for (int element : arr) {
            // check for element at every index
            if (element == target) {
                return true;
            }
        }
        // if not the element does not exist in the array
        return false;
    }

}