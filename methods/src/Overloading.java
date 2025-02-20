import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(10);
        fun("random string");
        fun(1,2,34,342,34,3);
        fun();
        //which function to call will be determined at compile time
    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String str){
        System.out.println(str);
    }
    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }
    static void fun(){
        System.out.println("dumb things to do");
    }
}
