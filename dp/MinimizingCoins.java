package dp;

public class MinimizingCoins {
    public static void main(String[] args) {
        int trg = 9;
        int[] coins = { 2, 3, 5 };
        int[] dp = new int[trg + 1];
        // System.out.println("Number of coins to make sum of " + trg + ": " +
        // minimalCoins(trg, coins, dp));
        // System.out.println("with dp: " + count);
        // System.out.println("without dp: " + withoutDP);

        System.out.println("Number of ways to make sum of " + trg + ": " + maxSum(trg, coins, dp));
        System.out.println("with dp: " + count);
        System.out.println("without dp: " + withoutDP);
    }

    static int min = Integer.MAX_VALUE;
    static int count = 0;
    static int withoutDP = 0;

    static int minimalCoins(int target, int[] coins, int[] dp) {

        if (target < 0) {
            return Integer.MAX_VALUE;
        }
        if (target == 0) {
            return 0;

        }
        withoutDP++;
        if (dp[target] != 0) {
            count++;
            return dp[target];
        }
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = minimalCoins(target - coin, coins, dp);

            if (result != Integer.MAX_VALUE) {
                minCoins = Math.min(result + 1, minCoins);
            }
        }
        dp[target] = minCoins;
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    static int maxSum(int target, int[] coins, int[] dp) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        withoutDP++;
        if (dp[target] != 0) {
            count++;
            return dp[target];
        }

        for (int coin : coins) {
            dp[target] += maxSum(target - coin, coins, dp);
        }
        return dp[target];
    }
}