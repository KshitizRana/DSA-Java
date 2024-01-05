package com.kshitiz;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(pro()+ " is the prodect.");
    }

    static int pro() {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = i.nextInt();
        System.out.print("Enter another number: ");
        int b= i.nextInt();
        return a*b;

    }
}
