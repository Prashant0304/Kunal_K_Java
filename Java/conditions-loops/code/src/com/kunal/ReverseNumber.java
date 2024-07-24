// Program to check given number is palindrome or not and making number as reverse
package com.kunal;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = in.nextInt();
        int oNumber= number;
        int ans =0;
        while(number > 0){
            int rem = number % 10;
            number = number / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
        if(oNumber ==  ans ){
            System.out.println("The given number is palindrome");
        }else {
            System.out.println("The number is not palindrome");
        }
    }
}
