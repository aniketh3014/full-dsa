import java.util.Scanner;

public class Numcount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int x = in.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == x) {
                count++;
            }
            num = num/10; //remove the last digit
        }
        System.out.println(count);
    }
}
