package com.kshitiz;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch>='a'&& ch<='z'){
            System.out.println("lowercase");
        }else {
            System.out.println("uppercase");
        }
    }
}
//next() takes a string in which trim() removes the pre and post spaces of the string and charAt(indexno.) gives the character at index of the string.
