import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of distinct natural numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the distinct natural numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j < q) {
                q = j;
            }
        }
        int p = q + 1;
        boolean flag = true;
        while (flag) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(p); i++) {
                if (p % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                boolean isDivisible = true;
                for (int i = 1; i < n; i++) {
                    if (p % arr[i] != q) {
                        isDivisible = false;
                        break;
                    }
                }
                if (isDivisible) {
                    flag = false;
                }
            }
            p++;

        }
        System.out.println("The smallest prime number p such that when p is divided by all the distinct numbers in the input, except q, should result q as the remainder is: " + (p - 1));

    }
}
