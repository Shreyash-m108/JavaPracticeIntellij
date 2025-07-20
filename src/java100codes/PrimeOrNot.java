package java100codes;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextInt();
        boolean isPrime = true;

        if(i<2){
            isPrime = false;
        }
        else {
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime?"Prime":"Not Prime");


    }
}
