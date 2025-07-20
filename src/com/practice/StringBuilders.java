package com.practice;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("SHREYASH");
        for(int i=0; i<=sb.length()/2;i++)
        {
            int front=i;
            int back= sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(back, frontchar);
            sb.setCharAt(front, backchar);
        }
        System.out.println(sb);
    }
}
