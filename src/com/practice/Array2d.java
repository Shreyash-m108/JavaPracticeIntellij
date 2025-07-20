package com.practice;
import java.util.*;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] flats= new int[3][3];
        int a,b,c=0;
        for (int i=0; i< flats.length; i++) {
            System.out.println("Enter a floor number: ");
            flats[i][c]=sc.nextInt();
            for (int j = 0; j < flats[i].length; j++)
            {
                System.out.println("Enter house number: ");
                flats[i][j]=sc.nextInt();
            }
            c++;
        }
        for (int i=0; i< flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++)
            {
            System.out.print(flats[i][j]);
            }
            System.out.println();
         }
    }
}
