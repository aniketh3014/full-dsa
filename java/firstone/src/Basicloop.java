public class Basicloop {
    public static void main(String[] args) {
        if (true) {
            System.out.println("hey!!!!");
        }
        if (false) {
            System.out.println("nope!");
        }
        int count = 0;
        while(count != 10) {
            System.out.println(count);
            count++;
        }
        for(int num = 0; num < 10; num++) {
            System.out.println(num);
        }
    }


}
