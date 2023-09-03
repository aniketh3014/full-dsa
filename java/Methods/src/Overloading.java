public class Overloading { // all this happens at compile time
    public static void main(String[] args) {
        ag(67); // it will automatically call the right function based on the values passed in
        ag("aniket");
        ag(5, 8);
    }
    // multiple functions can with same name can be used but with different arguments
    static void ag(int x) {
        System.out.println("first one");
        System.out.println(x);
    }
    static void ag(String name) {
        System.out.println("second one");
        System.out.println(name);
    }
    static void ag(int y, int z) {
        System.out.println("third one");//same type but different args
        System.out.println(y+z);
    }
}
