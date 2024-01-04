package com.kshitiz;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll no.: ");
        int rollno = input.nextInt();
        System.out.println("Your Roll no. is " + rollno);

    }
}

// Literals: Java literals are syntactic representation of boolean, character, numeric or string data.
// Identifiers: The names of the variables, methods, classes, packages and interfaces.

//If we give float a big number like 54698.569545689 it wil round off to 54698.56954 which is floating point error.

//Note*:If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
// do take input a new line using in.nextLine(). After this taking string input would take String as input.
