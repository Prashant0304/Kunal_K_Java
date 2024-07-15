package com.kunal;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        /*
        syntax of for loop
           for(initialisation;condition;increment or decrement){
            //body
            }
        */
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
        }
        /* syntax of while
        // while(condition){
            //body
            }
        */
        int j=1;
        while(j<=5){
            System.out.println(j);
            j++;
        }
        /*
        do{
         //body
        }while(condition);
        */
         do{
             System.out.println("Hello World!");
         }while();
    }
}
