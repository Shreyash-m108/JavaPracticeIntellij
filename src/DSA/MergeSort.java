package DSA;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr , int l , int r)
    {
        if(l<r){
            int mid= (l+r)/2;
            mergeSort(arr ,l ,mid);
            mergeSort(arr ,mid+1 ,r);
            merge(arr, l ,mid ,r);
        }
    }

    public static void merge(int[] arr , int l ,int mid , int r)
    {
        int n1 = mid-l+1;
        int n2=r-mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int a =0; a<n1; a++)
        {
            lArr[a]=arr[l+a];
        }
        for(int a=0; a<n2; a++)
        {
            rArr[a]=arr[(mid+1)+a];
        }
        int i=0 , j=0 , k=l;
        while(i<n1&&j<n2)
        {
            if(lArr[i]<rArr[j]){
                arr[k]=lArr[i];
                i++;
            }
            else
            {
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=lArr[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr ={5,8,1,3,9};
        mergeSort(arr , 0 , arr.length-1);
        System.out.print("Sorted array is: ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
