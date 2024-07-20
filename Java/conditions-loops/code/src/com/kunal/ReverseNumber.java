package com.kunal;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scanner.nextInt();
        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
