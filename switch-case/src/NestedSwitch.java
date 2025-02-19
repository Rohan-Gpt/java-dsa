import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String deptName = sc.next();

        switch (empId) {
            case 1 -> System.out.println("some random name");
            case 2 -> System.out.println("another random name");
            case 3 -> {
                switch (deptName) {
                    case "Software Engineering" -> System.out.println("IT");
                    case "Electrical Engineering" -> System.out.println("ECE");
                    default -> System.out.println("Other");
                }
            }
            default -> {
            }
        }

    }
}