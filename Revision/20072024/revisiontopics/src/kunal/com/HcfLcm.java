package kunal.com;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        int temp,temp1,temp2,hcf,lcm;
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
         temp1 = num1;
         temp2 = num2;
        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1*num2)/hcf;
        System.out.println("HCF : "+temp1);
        System.out.println("LCM : "+lcm);
    }
}
