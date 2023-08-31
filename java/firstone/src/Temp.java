import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner itemp = new Scanner(System.in);
        System.out.print("please enter a temp in C: ");
        float ctemp = itemp.nextFloat();

        float Ftemp = (ctemp * 9/5) + 32;
        System.out.println(Ftemp);
    }
}
