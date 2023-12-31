package com.kshitiz;

import java.util.Scanner;

// Package: Folder in which Java file will lie.
//
public class Main {
    //Public : This keyword is usede so that we can access it from anywhere
    //Class: Keyword for Name group of properties and function.
    //Main: Name of the file (it has to be same as name of the file )(Conventionally use initially character as capital . But If we donot want to make class name as file name then it should not be public. Eg if file name is Demo and you want to name class as Main you have to just write Class Main rather than public class

    public static void main(String[] args) {
//        Static: It Runs function without creating object of class Main.
//        void: it is Return type of function
//        main: It is Function that is entry program of the program
//        String[]args:  It means an array of sequence of characters("strings) That are passed to the main function.
        System.out.println("Hello world!");
//        System :System class are standard input, standard output, and error output stream in which out is a variable which is a print stream and out has method called println.
//println print in new line
//        print : print in same line
        Scanner input = new Scanner(System.in);
//        Scanner: A simple text scanner which can parse primitive types and strings using regular expressions.


    }
}

//after compilation created .class file is created and saved in current location where you are in.
//If you wnt to change the location use (javac -d <path> class_name.java)
// Environment variables: list  of folder addresses in which comp wil check command is available or not