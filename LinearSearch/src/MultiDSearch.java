import java.util.Arrays;

public class MultiDSearch {
    public static void main(String[] args) {
        int[][] arr = {{1,23,4,}, {1,4}, {5,68,8,8}};

        int target = 68;
        int[] ans = findIn2D(arr, target);

        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        System.out.println(min(arr));

    }
    static int[] findIn2D(int[][] arr, int target){
        for (int i = 0; i <arr.length; i++){
            for (int j =0; j< arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
    static int min(int[][] arr){
        int min = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }
}
