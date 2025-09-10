package dp;

public class RemovingDigits {
    public static void main(String[] args) {
        int n = 27;
        int[] dp = new int[n + 1];
        System.out.println(iterativeRemoveDig(n));
    }

    static int removeDig(int n, int[] dp) {
        int min = Integer.MAX_VALUE;
        if (n < 0) {
            return min;
        }

        if (n == 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0) {
                int result = removeDig(n - digit, dp);
                if (result != Integer.MAX_VALUE) {
                    min = Math.min(result + 1, min);

                }
            }
            temp = temp / 10;
        }

        dp[n] = min;
        return min;
    }

    static int iterativeRemoveDig(int n) {
        int[] dp = new int[n+1];
        int steps = 0;
        while (n > 0) {
            String str = String.valueOf(n);
            char maxDigit = '0';
            for (char c : str.toCharArray()) {
                if (c != '0') {
                    maxDigit = (char) Math.max(c, maxDigit);
                }
            }
            n -= (maxDigit - '0');
            steps++;
        }
        return steps;
    }
}
