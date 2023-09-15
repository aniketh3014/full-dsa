public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 3, 43, 5, 52, -10, 23, 88, 100, 10};
        int target = 88;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }
    //search in array: return the index if item found
    // otherwise if item not found return -1;
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // if not the element does not exist in the array
        return -1;
    }

}