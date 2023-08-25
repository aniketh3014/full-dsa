import java.util.Scanner;
public class Typecasting {
   //type casting
    public static void main(String[] args) {
        int number = (int) (67.123f);
        System.out.println(number);

        // automatic type promotion in expressions
        int a = 258;
        byte b = (byte) (a);
        System.out.println(b);

        int num = 'A';
        System.out.println(num);
    }

}
