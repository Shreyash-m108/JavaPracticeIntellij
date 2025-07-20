package com.practice;
import java.util.*;

public class Functions {




    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int a=0,pos=0 ,neg=0,zero=0;
        String ch;
        do{
            System.out.println("Enter a number: ");
            a=sc.nextInt();
            if(a>0){
                pos++;
            }
            else if(a<0){
                neg++;
            }
            else{
                zero++;
            }
            System.out.println("Continue (y/n)?");
            ch=sc.next();
        }while(ch.equals("y"));
        System.out.print("Positive: "+pos+"\n"+ "Negative: "+neg+"\n"+"Zeros: "+ zero);

    }
}
