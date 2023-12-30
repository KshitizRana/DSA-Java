package com.kshitiz.Assignments;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter number2: ");
        float num2 = input.nextFloat();

        if (num1 > num2){
            System.out.println(num1 + " is greater than"+ num2);
        }
        else {
            System.out.println(num2 +" is greater than "+ num1 );
        }
    }
}
