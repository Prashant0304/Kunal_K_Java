//Problem: Finding n th fibonacci number
package com.kunal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = input.nextInt();
        int a = 0;
        int b = 1;

//        This logic provides series of fibonacci
//        for(int i=1;i<=number;i++){
//            int nextNumber = a+ b;
//            System.out.print(" "+nextNumber);
//            a = b;
//            b = nextNumber;
//        }
//        This will return only at given value
        int count =2;
        while(number >= count){
            int nextNumber = b;
            b = a+b;
            a= nextNumber;
            count++;
        }
        System.out.println(b);
    }
}
