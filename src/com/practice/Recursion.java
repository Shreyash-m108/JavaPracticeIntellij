package com.practice;

public class Recursion {
    public static void PrintNum(int m){
        int n=1;
        if(n==m){
            return;
        }
        else{
            PrintNum(n+1);
        }
    }

    public static void main(String[] args) {
       int n=1;
        PrintNum(n);
    }
}
