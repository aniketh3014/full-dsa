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

        byte B = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.324f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + "" + (i / c) + "" + (d - s));
        // float + int - double = double
        System.out.println(result);

    }

}
