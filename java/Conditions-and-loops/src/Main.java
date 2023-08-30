public class Main {
    public static void main(String[] args) {

        int salary = 25600;
        if (salary > 18000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}