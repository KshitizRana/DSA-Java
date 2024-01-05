package com.kshitiz;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        elegi(age);

    }

    static void elegi(int a) {
        if (a>=18){
            System.out.println("Elegible to vote.");
        }
        else {
            System.out.println("Cannot vote.");
        }
    }

}
