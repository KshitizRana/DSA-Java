package com.kshitiz.assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // factorial of a given number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int fact=num;
        for (int i=1;i<num;i++){
                fact= fact*(num-i);
        }
                System.out.println("Factorial of "+num+" is "+fact);
    }
}
