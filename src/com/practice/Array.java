package com.practice;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num= new int[] {1,2,3,4,5};
//        for(int i=0; i<num.length; i++) {
//            num[i] = sc.nextInt();
//        }
        System.out.println("Enter a num to find: ");
        int x=sc.nextInt();
        int flag=0;
        for(int i=0; i< num.length; i++)
        {
            if(num[i]==x)
            {
                System.out.println("The number is present at Index"+i);
                flag=1;
            }

        }
        if(flag==0)
        {
            System.out.println("Not find");
        }

    }
}