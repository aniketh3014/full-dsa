public class Shadowing {
    static int x = 50; //this will be shadowed in line 6
    public static void main(String[] args) {
        System.out.println(x); // this will print 50
        int x = 30;
        System.out.println(x); //this will print 30, the lower level is overiding the upper level this is shadowing
        ex();
    }
    static void ex() {
        System.out.println(x); // since this is in the scope of shadowing and out of the scope of main it will print 50
    }
}
