package DSA;

import java.util.Scanner;

public class Recursion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Count: ");
        int n=sc.nextInt();
        for (int i =1; i <=n ; i++) {
            System.out.println(Fibonacci(i));
        }

    }

    static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);

    }
}
