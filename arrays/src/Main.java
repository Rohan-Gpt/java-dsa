import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr; //declared an array
        arr = new int[5]; //init : here object is being created in the memory

        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j: arr){
            System.out.println(j);
        }
    }
}