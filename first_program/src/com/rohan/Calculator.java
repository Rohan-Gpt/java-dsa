package com.rohan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = 'a';

        while (!(op =='x' || op =='X')) {
            System.out.println("press x to exit and calculate");
            op = sc.next().charAt(0);
            if (op== '+' || op== '-' || op == '*' || op == '/') {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    System.out.println(num1 + num2);
                }
                if (op == '-'){
                    System.out.println(num1 - num2);
                }
                if (op == '*'){
                    System.out.println(num1 * num2);
                }
                if (op == '/'){
                    System.out.println(num1 / num2);
                }
            }
        }
        sc.close();
    }
}
