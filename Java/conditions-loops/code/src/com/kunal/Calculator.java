package com.kunal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter choice");
        System.out.println("1. Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulus");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 : int add = number1 + number2;
                System.out.println("Addition :"+add);
                break;

            case 2 : int sub = number1 - number2;
                System.out.println("Subtraction :"+sub);
                break;

            case 3 : int mul = number1 * number2;
                System.out.println("Multiplication :"+mul);
                break;

            case 4 : int div = number1/ number2;
                System.out.println("Division :"+div);
                break;

            case 5 : int mod = number1 % number2;
                System.out.println("Modulous :"+mod);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
