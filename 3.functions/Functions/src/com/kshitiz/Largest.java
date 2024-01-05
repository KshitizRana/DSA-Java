package com.kshitiz;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a = in.nextInt();
        System.out.print("Enter number2: ");
        int b = in.nextInt();
        System.out.print("Enter number3: ");
        int c = in.nextInt();
        max(a, b, c);
        min(a, b, c);
    }

    static void max(int a, int b, int c){
        if (a>b && a>c){
            System.out.println(a+" is greatest.");
        }
        else if (b>a && b>c){
            System.out.println(b+" is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }
    }
    static void min(int a,int b, int c){
        if (a<b && a<c){
            System.out.println(a+" is smallest.");
        }
        else if (b<a && b<c){
            System.out.println(b+" is smallest.");
        }
        else{
            System.out.println(c+" is smallest");
        }
    }
}
