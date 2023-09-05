public class Main {
    public static void main(String[] args) {

        // array syntax
        // datatype[] variable_name = new datatype[size];

        //store 5 roll numbers:
        int[] roll = new int[5];
        // or do it directly
        int[] roll2 = {1,2,3,4,5};

        int[] roll3; // declaration , getting defined into stack memory.
        roll3 = new int[5]; // initialisation, here object is being created in the heap memory.
        System.out.println(roll3[1]);

        String[] k = new String[4];
        System.out.println(k[2]);

    }
}