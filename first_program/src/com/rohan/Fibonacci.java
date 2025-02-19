package com.rohan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to print: ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.print(first + " ");

        for (int i = 0; i < n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
            System.out.print(first+ " ");
        }
    }
}
