import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        ag(12,3,4343,4,45,45453,4553545);
        multiple(1,2, "aniket", "soumitra", "raja");
    }
    static void ag(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v)); //prints only string part
        System.out.println(a+ " and " +b); // other ints cna be accesed too like this
    }
}
