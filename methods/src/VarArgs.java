import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,2,3,3,43,2);
    }
    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }
}
