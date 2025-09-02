package dp;

public class Fibo {
    public static void main(String[] args) {
        int n = 20;

        int[] arr = new int[n + 1];
        System.out.println(fibo(n, arr));
        System.out.println(times);
    }

    static int times = 0;

    static int fibo(int n, int[] arr) {
        if (n <= 2) {
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        times++;

        return arr[n] = fibo(n - 1, arr) + fibo(n - 2, arr);
    }
}
