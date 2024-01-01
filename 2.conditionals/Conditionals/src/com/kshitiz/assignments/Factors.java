package com.kshitiz.assignments;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        while (num!= 0){
            for (int i=1;i<=num; i++){
                if (num%i==0){
                    System.out.println(i);
                    num =num-1 ;
                }

            }

        }
    }
}
