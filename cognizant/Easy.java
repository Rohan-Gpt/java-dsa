package cognizant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy {
    public static void main(String[] args) {
        String str = "elle";
        // System.out.print(revString(str));
        // swapNum(10, 11);
        // System.out.println(fact(4));
        // System.out.print(isPalindrome(str));
        // fibo(10);
        String text = "The company was founded in 1999 and expanded in 2005, with plans for 2025.";
        // extractText(text);
        // convertTime("14:02");
        int[] arr = { 1, 2, 4, 3, 2 };
        int[] result = busyFactory(arr, 10);
        System.out.print(Arrays.toString(result));
    }

    static String revString(String str) {
        char[] inp = str.toCharArray();
        int l = 0;
        int r = inp.length - 1;
        while (l < r) {
            char temp = inp[l];
            inp[l++] = inp[r];
            inp[r--] = temp;
        }
        String rev = new String(inp);
        return rev;
    }

    static void swapNum(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (r > l) {
            if (str.charAt(l++) != str.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

    static void fibo(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        for (int i = 0; i < n; i++) {
            int third = second;
            System.out.print(second + " ");

            second += first;
            first = third;
        }
    }

    static void extractText(String str) {
        for (String token : str.split("\\s+")) {
            token = token.replaceAll("\\D+$", "");
            token = token.replaceAll("^\\D+", "");
            if (token.matches("(1[0-9]{3}|2[0-9]{3})")) {
                System.out.println(token);
            }
        }
    }

    static void convertTime(String time24) {
        String[] arr = time24.split(":");
        int hour = Integer.parseInt(arr[0]);
        int minutes = Integer.parseInt(arr[1]);

        String meredian = hour > 12 ? "PM" : "AM";

        hour = hour % 12;
        if (hour == 0)
            hour = 12;

        System.out.print(String.format("%02d:%02d %s", hour, minutes, meredian));
    }

    static int[] busyFactory(int[] arr, int c) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int diff = sum - arr[i];
            result[i] = diff > c ? c : diff;
        }
        return result;
    }
}
