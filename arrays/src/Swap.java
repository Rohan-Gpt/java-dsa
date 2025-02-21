import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,34,4,4};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr, int index1, int index2){
        int temp =arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
}
