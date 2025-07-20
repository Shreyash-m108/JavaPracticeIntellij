package com.practice;
import java.util.Stack;

public class Evaluator {
    public static boolean isOperator(char ch)
    {
        return(ch=='+'|| ch=='-'|| ch=='*'|| ch=='/');
    }
    public static boolean isOperand(char ch)
    {
        return(ch>='0' && ch<='9');
    }

    public static int evaluateSuffix(String suffix)
    {
        Stack<Integer> stack = new Stack<>();
        int first=0,second=0;

        for(int i=0;i<suffix.length();i++)
        {
            if(isOperand((suffix.charAt(i))))
            {
                stack.push(suffix.charAt(i)-'0');
            }
            if (isOperator(suffix.charAt(i)))
            {
                second=stack.pop();
                first=stack.pop();
            }

            switch (suffix.charAt(i))
            {
                case'+':
                    stack.push(first+second);
                    break;

                case'-':
                    stack.push(first-second);
                    break;

                case'*':
                    stack.push(first*second);
                    break;

                case'/':
                    stack.push(first/second);
                    break;
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        System.out.println(evaluateSuffix("20-10+*2/"));
    }
}
