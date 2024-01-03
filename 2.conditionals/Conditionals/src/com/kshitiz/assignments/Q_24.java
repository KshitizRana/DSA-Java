package com.kshitiz.assignments;

import java.util.Scanner;

public class Q_24 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Enter number: ");
            num = in.nextInt();
            sum = sum + num;
            System.out.println(sum);
        } while (num != 0);
    }
}
