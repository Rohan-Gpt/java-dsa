package dp;

public class Dice {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[n + 1];
        System.out.println(maxSum(n, arr));
        System.out.println(count);
    }

    static int count = 0;

    static int maxSum(int target, int[] dp) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }

        if (dp[target] != 0) {
            count++;
            return dp[target];
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dp[target] += maxSum(target - i, dp);
        }
        return dp[target];
    }
}
