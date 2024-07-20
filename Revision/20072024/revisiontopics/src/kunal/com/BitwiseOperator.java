package kunal.com;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int and = a&b;
        System.out.println("AND value : "+and);

        int or = a|b;
        System.out.println("OR value : "+or);

        int not = ~a;
        System.out.println("a NOT value : "+not);

        int notb= ~b;
        System.out.println("b NOT value : "+notb);

    }
}
