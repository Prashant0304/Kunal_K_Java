package com.kunal;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        System.out.println("Num :"+num);

        int num =(int)(67.55f); //type casting
        System.out.println(num);

        byte num1 =(byte)(68.12f);
        System.out.println(num1);

//automatic type promotion in expressions
        int a=257;
        byte b=(byte)a;

        System.out.println(b);


    }
}
