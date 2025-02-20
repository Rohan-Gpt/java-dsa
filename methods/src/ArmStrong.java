import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        for (int i=100; i<1000; i++){
            if (isArmStrong(i)){
                System.out.println(i);
            }

        }
    }
    static boolean isArmStrong(int num){
        int temp=0;
        int originalNum = num;
        while (num>0){
            temp = temp+ ((num%10)*(num%10)*(num%10));
            num = num/10;
        }

        return temp == originalNum;

    }
}
