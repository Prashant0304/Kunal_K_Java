package com.kunal;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner in = new Scanner(System.in);
        char name = in.next().charAt(0);// to provide char input this way

        System.out.println(name);//It prints every thing
//        System.out.println(name.charAt(0));//It provides 1st character of input
//        System.out.println("Trim removes extra space in the statement :"+name.trim());

        if((name >= 'a')&&( name <= 'z')){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
