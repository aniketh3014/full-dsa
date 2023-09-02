public class Swap {
    public static void main(String[] args) {
        int a = 134;
        int b = 124;
        swap(a, b);
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
