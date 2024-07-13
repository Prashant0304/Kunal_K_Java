package com.kunal;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = input.nextInt();
        if(year % 4 == 0){
            System.out.println("This is Leap year");
        }
        else{
            System.out.println("It is not a Leap year");
        }

    }
}
