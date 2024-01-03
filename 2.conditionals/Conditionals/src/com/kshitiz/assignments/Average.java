package com.kshitiz.assignments;

import java.util.Scanner;

public class Average {
    //Average of N numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of terms: ");
        int N = in.nextInt();
        int sum = 0;
        for (int i =1 ;i <=N;i++){
            System.out.print("Enter a number");
            num = in.nextInt();
            sum = sum+num;
        }
        float avg = sum/N;
        System.out.println(avg);
    }
}
