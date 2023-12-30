package com.kshitiz.Assignments;

import java.util.Scanner;

public class Currencyconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount in Rupee: ");
        int rup = input.nextInt();
        float  dollar = rup/80;
        System.out.println(rup+" in Rupees is equal to "+dollar+"$");
    }
}
