package com.kunal;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        float fNumber = input.nextFloat();
        System.out.print("Enter second Number : ");
        float sNumber = input.nextFloat();
        float sum= fNumber+sNumber;
        System.out.println("Sum = "+sum);
    }
}
