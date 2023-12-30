package com.kshitiz.Assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        int n = num;
        int rev = 0;
        while(num>0){
            int dig = (int)(num%10);
             rev = rev *10 + dig;
             num =(num/10);
        }
        
        if (n == rev){
            System.out.println("Number "+ n +" is Palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }

    }
}
