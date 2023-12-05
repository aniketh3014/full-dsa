public class FibonachiWithRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n) {
        // add a base condition to break the chain
        if (n == 1) {
            return 1;
        }
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
