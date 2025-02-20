import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();
        sum(num1, num2);

        int val = sum2(num1, num2);
        System.out.println("this is the value of sum2: "+ val);
    }
    static void sum(int num1, int num2){
        int sumOfNum = num1 + num2;
        System.out.println("the sum of "+ num1 + " and " + num2 + " is "+  sumOfNum);
    }

    static int sum2(int num1, int num2){
        return num1 + num2;
    }
}