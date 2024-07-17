package com.kunal;
import java.util.Scanner;
public class BitwiseOp {
    public static void main(String[] args) {
//      user input providing
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = input.nextInt();
        System.out.print("Enter b value : ");
        int b = input.nextInt();
//        int a = 6; //its bitwise value is 100
//        int b = 7; //its bitwise value is 111
//        Bitwise AND operator
        int result = a&b;
        System.out.println("Result is = "+result);
    }
}
