package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void sortedArray(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arrSize = sc.nextInt();
        int[] Arr = new int[arrSize];
        System.out.println("Enter the array elements: ");
        for (int i =0 ; i<Arr.length; i++)
        {
            Arr[i]=sc.nextInt();
        }
        System.out.print("The array elements are: ");
        for(int i: Arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        sortedArray(Arr);
    }
}
