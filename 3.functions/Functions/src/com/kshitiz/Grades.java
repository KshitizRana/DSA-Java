package com.kshitiz;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Your grade is: "+grade());
    }
    static String grade(){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int mark= i.nextInt();
        if (mark>=91 && mark<=100){
            return "AA";
        } else if (mark>=81 && mark<=90) {
            return "AB";
        }else if (mark>=71 && mark<=80) {
            return "BB";
        }else if (mark>=61 && mark<=70) {
            return "BC";
        }else if (mark>=51 && mark<=60) {
            return "CC";
        }else if (mark>=41 && mark<=50) {
            return "DD";
        }else {
            return "Fail";
        }


    }
}

