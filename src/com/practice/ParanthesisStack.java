package com.practice;

import java.util.Stack;

public class ParanthesisStack {

    public static String checkString(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            else{
                if(!stk.isEmpty()&&
                        ((s.charAt(i)==')'&& stk.peek()=='(')||
                         (s.charAt(i)=='}'&&stk.peek()=='{')||
                         (s.charAt(i)==']'&&stk.peek()=='['))
                ){
                    stk.pop();
                }
                else{
                    return "No";
                }
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        String s = "({)";
        System.out.println(checkString(s));
    }
}
