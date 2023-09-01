import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //take input and like mango and output "king of fruits", i can do it by many if statements but it will be very repetative.
        Scanner in = new Scanner(System.in);
      //  String fruit = in.next();

        //new switch statement syntax:
     /*   switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A nice red fruit");
            case "grapes" -> System.out.println("Small fruit");
            case "orange" -> System.out.println("good fruit");
            default -> System.out.println("please enter a valid fruit");


        } */
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}