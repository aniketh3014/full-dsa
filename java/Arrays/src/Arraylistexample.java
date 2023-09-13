import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(4354);
        list.add(654);
        list.add(8748);
        list.add(867);
        list.remove(1);
        System.out.println(list.contains(654));
        list.set(0, 100);
        System.out.println(list);

    }
}
