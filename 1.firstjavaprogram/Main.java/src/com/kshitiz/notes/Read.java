package com.kshitiz;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double d = in.nextDouble();
        // to fix this issue add new line here in.nextLine()
        in.nextLine();
        String s = in.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}
