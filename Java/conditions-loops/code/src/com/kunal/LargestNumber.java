package com.kunal;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if(b > max ){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

//        Using Math.max function
        int max = (Math.max(c,Math.max(a,b)));

//        int max;
//        if(a >= b && a >= c){
//           max = a;
//        }
//        else if(b >= c) max = b;
//        else{
//            max = c;
//        }
        System.out.println("Maximum = "+max);
    }
}
