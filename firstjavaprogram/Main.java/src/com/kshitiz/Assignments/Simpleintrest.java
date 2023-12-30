package com.kshitiz.Assignments;

import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int princi = input.nextInt();
        System.out.println("Enter Rate of Interest: ");
        float roi = input.nextFloat();
        System.out.println("Enter Time in years: ");
        int time = input.nextInt();

        float si = (princi*roi*time)/100;
        System.out.println("Simple Interest is: " + si);
    }
}
