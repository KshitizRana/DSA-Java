package com.kshitiz.Assignments;

import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  number1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter  number2: ");
        float num2 = input.nextFloat();

        System.out.println("What operation (1(+),2(-),3(*),4(/))");
        int oper = input.nextInt();

        if (oper == 1) {
            float sum = num1+num2;
            System.out.println("Sum is " + sum);
        } else if (oper == 2) {
            float sub = num1 - num2;
            System.out.println("Difference is "+sub);
        } else if (oper==3) {
            float mult= num1*num2;
            System.out.println("Product is "+ mult);
        } else{
            float div= num1/num2;
            System.out.println("div");
        }


    }
}
