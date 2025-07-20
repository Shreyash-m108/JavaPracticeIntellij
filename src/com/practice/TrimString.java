package com.practice;

import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.print(name.trim());
    }
}
