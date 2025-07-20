package DSA;

import java.util.Scanner;

public class BinarySearch {
    public static void binarySearch(int[] arr, int checkValue){
        int left =0;
        int right =arr.length-1;
        while(left<=right)
        {
            int mid = (left + right)/2;

            if(mid == checkValue)
            {
                System.out.println("Your value "+checkValue+" is present.");
                return;

            }
            else if(checkValue > mid)
            {
                left =mid +1;

            }

            else
            {
                right = mid-1;
            }

        }
        System.out.println("Value Not Present.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println("Enter element you want to search: ");
        int searchNumber =sc.nextInt();

        binarySearch(arr ,searchNumber);
    }
}
