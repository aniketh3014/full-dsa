public class Question {
    public static void main(String[] args) {
        //print all the three digit aramstrong numbers
        int n =153;
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
