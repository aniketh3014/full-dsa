import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       int x = sum2(122, 122);
        System.out.println(x);
    }
    /*
    return_type name () {
        //body
        return statement; //it will be void if the method does not return anything
       }
     */
    static int sum1() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = num1+num2;
        return num3;
    }
    static int sum2(int a, int b) {
        return a+b;
    }
}
