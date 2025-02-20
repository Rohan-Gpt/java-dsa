import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String greeting = greet(name);
        System.out.println(greeting);
    }
    static String greet(String name){
        return "hello " + name;
    }
}
