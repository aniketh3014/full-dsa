public class Main {
    public static void main(String[] args) {
        printPaturn(6);
    }

    static void printPaturn(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int noberOfCol = row < n ? 2 * n - row: row;
            for(int col = 0; col < noberOfCol; col++) {
                System.out.print(" $ ");
            }
            System.out.println();
        }
    }
}