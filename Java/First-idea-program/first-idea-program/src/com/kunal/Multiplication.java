package com.kunal;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();


//        for(int i=1;i<=10 ; i++){
//            System.out.println(  number+ " * " +i+  " = " + number  *  i );
//        }
//        int i=1;
        while(i <= 10){
            System.out.println(number+ " * " +i+  " = "+number * i);
            i++;
        }

    }
}
