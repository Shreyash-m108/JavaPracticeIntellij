package com.practice;
import java.util.Scanner;
public class Sorting {
    public static void Bubble(int[] arr1){
        for(int i=0; i< arr1.length-1; i++)
        {
            for(int j=0; j< arr1.length-i-1; j++)
            {
             if(arr1[j]>arr1[j+1])
             {
                int temp= arr1[j];
                arr1[j]=arr1[j+1];
                arr1[j+1]=temp;
             }
            }
        }
        for(int element: arr1)
        {
            System.out.print(element+" ");
        }
    }

    public static void Selection(int[] arr1){
        for(int i=0; i<arr1.length-1; i++){
            int ele=i;
            for(int j=i+1; j< arr1.length; j++)
            {
                if(arr1[ele]>arr1[j])
                {
                    ele=j;
                }
                int temp= arr1[ele];
                arr1[ele]=arr1[i];
                arr1[i]=temp;
            }
        }
        for(int element: arr1)
        {
            System.out.print(element+" ");
        }
    }

    public static void Insertion(int[] arr){
        for(int i=0; i<arr.length; i++)
        {
            int current= arr[i];
            int j= i-1;
            while(j>=0 && current < arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int element: arr)
        {
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers are there: ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter these numbers: ");
        for(int i=0; i< arr.length-1; i++)
        {
            arr[i]=sc.nextInt();
        }
        Bubble(arr);
        Selection(arr);
        Insertion(arr);
    }
}
