//Problem: To find number of occurance of digit
package com.kunal;

public class CountNum {
    public static void main(String[] args) {
        int number = 894555;
        int count = 0;
        while(number > 0 ){
            int rem = number % 10;
            if(rem == 5){
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
