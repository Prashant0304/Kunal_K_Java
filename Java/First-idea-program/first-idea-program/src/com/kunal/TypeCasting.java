package com.kunal;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        System.out.println("Num :"+num);

//        int num =(int)(67.55f); //type casting
//        System.out.println(num);
//
//        byte num1 =(byte)(68.12f);
//        System.out.println(num1);

//automatic type promotion in expressions
//        int a=257;
//        byte b=(byte)a;
//
//        System.out.println(b);


//        System.out.println(75.21 * 8); //It going to print floating value without explicit mentioning

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s); //type casting happend by internally
        System.out.println( (f*b) +" "+( i / c ) +" "+(d*s) );
        System.out.println(result);

    }
}
