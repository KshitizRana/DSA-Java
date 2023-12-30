package com.kshitiz.Assignments;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms to be printed: ");
        int terms = input.nextInt();

        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" ");
        System.out.print(num2+" ");

        for(int i = 0; i<terms-2;i++){
            int nextnum=num1+num2;
             num1 = num2;
             num2 = nextnum;

            System.out.print(nextnum+" ");

        }


    }
}
