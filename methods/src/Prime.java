import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
    }
    static void isPrime(int num){
        if (num <=0 ){
            System.out.println("not a prime number");
        } else if (num%2 == 0 || num%3 ==0 || num%5 ==0 || num%7==0 ){
            System.out.println("not a prime number");
        } else {
            System.out.println("prime number");
        }
    }
}
