package com.practice;
import java.util.*;
public class PracticeArray {
    public static void ArraySum(){
        Scanner sc= new Scanner(System.in);
        float[] sum= new float[5];
        System.out.println("Enter 5 elements: ");
        for(int i=0; i<sum.length; i++)
        {
            sum[i]=sc.nextFloat();
        }
        float tot=0;
        for(int i=0; i<sum.length; i++)
        {
            tot= tot + sum[i];
        }
        System.out.println("Sum is: "+tot);
    }

    public static void FindingInt()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size= sc.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter "+size+" numbers: ");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number you want to find: ");
        int num= sc.nextInt();
        int f=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==num) {
                System.out.println("The number is at " + i + " position.");

            }
        }
        if(f>0)
            System.out.println("Number is not present in a array.");
    }

    public static void FindAverage(){
        Scanner sc= new Scanner(System.in);
        int [] arr= new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i< arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        int tot=0;
        for(int i=0; i<arr.length; i++)
        {
            tot= tot+ arr[i];
        }
        System.out.println("Average is: "+ tot/arr.length);
    }
    public static void ArrayReversing(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter "+size+" values:");
        for(int i=0; i< arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        int temp=0;
        for(int i=0 ; i< arr.length/2; i++)
        {
            temp= arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(int element:arr){
            System.out.println(element);
        }

    }

    public static void FindMax(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter "+size+" values:");
        for(int i=0; i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=0;
        int min=0;
        for(int num: arr){
            if(num>max)
            {
                max=num;
            }
        }
        for(int i = 0; i< arr.length; i++)
        {
            min= arr[i];
            int n=i+1;
            if(n== arr.length){
                break;
            }
            else if(arr[n]<min)
            {
                min=arr[n];
            }
        }
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);
    }


    public static void main(String[] args) {
        //ArraySum();
        //FindingInt();
        //FindAverage();
        //ArrayReversing();
        //FindMax();
    }
}
