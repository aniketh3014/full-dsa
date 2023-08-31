import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++) {
            System.out.println("hello world");
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print( i+ " ");
        }
        int hum = 1;
        while(hum<=100) {
            System.out.println(hum);
            hum++;
        }
    }

}





