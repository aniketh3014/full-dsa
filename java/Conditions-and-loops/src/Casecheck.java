import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.println("Uppercase");
        } else {
            System.out.println("Lolwercase");
        }
        //System.out.println(ch);
    }
}
