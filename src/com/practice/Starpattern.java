package com.practice;

import java.util.*;

public class Starpattern {
    public static void Solidpattern()
    {
        int a=5;
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<a; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Hollowrec(){
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1;j<=a; j++){
                if(i==1||j==1||i==a||j==a)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Halfpyramid()
    {
        int a=5;
        for(int i=1; i<=5 ; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Invertedpyramid(){
        int a=5;
        for (int i=a; i>=1; i--){
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inverted180()
    {
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=(a-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void  NumberHalfPy()
    {
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void InvertedNum(){
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=a-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }


        public static void FloydsTri(){
            int a=5;
            int n=1;
            for(int i=1; i<=a; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    System.out.print(n++ +" ");

                }
                System.out.println();
            }
        }

        public static void Triangle01(){
            int a=5;
            for(int i=1; i<=a; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print("1 ");
                    }
                    else
                    {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }

        }

        public static void Rhombus(){
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=a-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++)
            {
                System.out.print(" * ");
            }
            for(int j=1; j<=a-i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        }

    public static void Rhombus2() {
        int a = 5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=9; j++)
            {
                if(i+j==6||i+j==7||i+j==8||i+j==9)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void Butterfly()
    {
        int a=4;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=i; j++ )
            {
                System.out.print(" * ");
            }
            int space=2*(a-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=a; i>=1;i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            int space=2*(a-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void NumberFullPyd(){
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=a-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    public static void Palindromenumber(){
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=a-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            for (int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Diamond(){
        int a=5;
        for(int i=1; i<=a; i++)
        {
            for(int j=1; j<=a-i; j++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<= 2*i-1; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=a; i>=1; i--)
        {
            for(int j=1; j<=a-i; j++)
            {
                System.out.print("   ");
            }
            for(int j=1; j<= 2*i-1; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        //Solidpattern();
        //Hollowrec();
        //Halfpyramid();
        //Invertedpyramid();
        //Inverted180();
        //NumberHalfPy();
        //InvertedNum();
        //FloydsTri();
        //Triangle01();
        //Rhombus();
        //Rhombus2();
        //Butterfly();
        //NumberFullPyd();
        //Palindromenumber();
        Diamond();
    }
}
