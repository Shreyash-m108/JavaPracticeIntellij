package DSA;

import java.util.Scanner;

public class LinearSearch {
    public static void linearSearch(int[] arr, int checkval)
    {
        int left =0;
        for(int i=0 ; i<=arr.length-1 ; i++)
        {
            if(arr[i] == checkval)
            {
                System.out.println("The value "+checkval+" is present in Array.");
                return;
            }
            else
            {
                arr[i]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println("Enter the element you want to search: ");
        int checkNumber= sc.nextInt();
        linearSearch(arr ,checkNumber);
    }
}
