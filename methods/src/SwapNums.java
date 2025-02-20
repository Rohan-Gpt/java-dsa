import java.util.Scanner;

public class SwapNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();

        swap(num1, num2);

    }
    static void swap(int num1, int num2){
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println(num1+ " " + num2);
    }
}
