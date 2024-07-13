package com.kunal;

import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temparature in celcius : ");
        float tempC = input.nextFloat();

        float tempF= (tempC * 9/5 ) + 32;
        System.out.println("The conversion value celcius to farenhit is : "+tempF);
    }
}
