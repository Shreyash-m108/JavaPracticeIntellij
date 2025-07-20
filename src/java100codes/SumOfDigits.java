package java100codes;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        System.out.println("Sum of digits is " + sumFunction(num));
    }
    
    public static int sumFunction(int num) {
        if(num == 0)
            return 0;

        return (num%10) + sumFunction(num/10);
    }

}
