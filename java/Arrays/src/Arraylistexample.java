import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>(2);
//        list.add(4354);
//        list.add(654);
//        list.add(8748);
//        list.add(867);
//        list.remove(1);
//        System.out.println(list.contains(654));
//        list.set(0, 100);
//        System.out.println(list);

        // taking input to fill the array list
        for (int i =0; i < 3; i++) {
            list.add(in.nextInt());
        }

        // accessing the elements by for loops
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
       // System.out.println(list);


    }
}
