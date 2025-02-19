import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit) {
//            case "apple" -> System.out.println("fruit");
//            case "orange" -> System.out.println("orange");
//            case "banana" -> System.out.println("banana");
//            case "grape" -> System.out.println("grape");
//            default -> System.out.println("unknown fruit");
//        }

        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        }
    }
}