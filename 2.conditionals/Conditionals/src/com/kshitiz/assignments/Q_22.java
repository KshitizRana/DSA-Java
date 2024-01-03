package com.kshitiz.assignments;

import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int a = in.nextInt();
        int sum = 0;
        int pro = 1;
        while (a>0){
            int rem = a%10;
            sum = sum + rem;
            pro = pro*rem;
            a/=10;
        }
        System.out.println(pro-sum);
    }
}
