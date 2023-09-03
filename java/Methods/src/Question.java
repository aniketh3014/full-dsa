import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        //print all the three digit aramstrong numbers
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number to check: ");
        int n = in.nextInt();
        System.out.println(armstrong(n)); // prints is true or false

    }
    static boolean armstrong(int num) {
        int orig = num;
        int sum =0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + (rem*rem*rem);
        }
        return orig == sum;
    }
}
