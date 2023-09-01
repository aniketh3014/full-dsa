import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Id = in.nextInt();
        String department = in.next();
        // enhanced nested switch
        switch (Id) {
            case 1 -> {
                System.out.println("employee no 1");
                switch (department) {
                    case "It" -> System.out.println("It department");
                    case "CSE" -> System.out.println("CSE department");
                    default -> System.out.println("enter correct Department!");
                }
            }
            default -> System.out.println("enter correct Id");
        }

    }
}
