package com.kshitiz;

import java.util.Scanner;

public class Facortial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (num == 0){
            System.out.println("factorial of "+num+" is 1.");
        }else {
        System.out.println("Factorial of "+num+" is "+factorial(num));
        }
        }
    static int factorial(int num){
        int fact=num;
        for (int i=1;i<num;i++){
            fact= fact*(num-i);
        }
        return fact;
    }
}
