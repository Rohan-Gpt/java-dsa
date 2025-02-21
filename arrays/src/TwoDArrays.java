import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr= {
                {1,23,213},
                {2,41},
                {12,4,2,1,}
        }; //2d arrays can have variable number of columns

        int[][] arr2D = new int[3][2];

        for (int i=0; i<arr2D.length; i++){
            for (int j=0; j<arr2D[i].length; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        for(int[] num: arr2D){
            for (int arrnum: num){
                System.out.print(arrnum+ " ");
            }
            System.out.println();
        }

    }
}
