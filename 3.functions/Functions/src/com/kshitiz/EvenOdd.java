package com.kshitiz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        if (a == 0) {
            System.out.println(a+" is neither even nor odd.");
        }
        evennodd(a);
    }
    static void evennodd(int num){
        if (num%2==0){
            System.out.println(num + " is even.");
        }
        else {
            System.out.println(num+" is odd.");
        }
    }
}

