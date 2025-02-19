package com.rohan;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
//        String num = sc.nextLine();
//        System.out.println("Enter the occurrence: ");
//        char target = sc.nextLine().charAt(0);
//        int occurrence = 0;
//        for (int i = 0; i < num.length(); i++) {
//            if (num.charAt(i) == target) {
//                occurrence++;
//            }
//        }
//        System.out.println(occurrence);

        int num = sc.nextInt();
        System.out.println("Enter the occurrence: ");
        int target = sc.nextInt();
        int occurrence = 0;
        while (num > 0){
            if (num%10 == target){
                occurrence++;
            }
            num = num/10;
        }
        System.out.println(occurrence);

    }
}
