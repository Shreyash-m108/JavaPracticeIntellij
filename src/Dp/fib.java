package Dp;
import java.util.*;
class fib{
    public static int Fib(int a)
    {
        if(a==0)
            return 0;
        
        else if(a== 1 || a==2)
            return 1;
        
        return Fib(a-1) + Fib(a-2);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Count: ");
        int a = sc.nextInt();
        for(int i=0 ; i<a ; i++){
            System.out.print(Fib(i)+" ");
        }
        
        
         
    }
}