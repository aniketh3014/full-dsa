public class Searchstrings {
    public static void main(String[] args) {
        String name = "aniket";
        char target = 'e';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target) {
        if  (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
        }
        }
        return false;
    }
}
