package com.kunal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("please enter some input: ");
//        int rollNo = input.nextInt();
//        System.out.println("Your Roll no is : "+rollNo);

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

    }
}
