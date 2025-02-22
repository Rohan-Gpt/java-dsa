import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        int ans = maxWealth2(arr);
        System.out.println(ans);
    }
    static int maxWealth(int[][] accounts){
        int max =0;
        for (int[] account : accounts) {
            int count = 0;
            for (int num : account) {
                count = count + num;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
    static int maxWealth2(int[][] accounts){
        int max =0;
        for (int[] account : accounts) {
            int sum =Arrays.stream(account).sum();
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}
