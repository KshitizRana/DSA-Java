package com.kshitiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int k = 1;
        ArrayList<Integer> fact =new ArrayList<>();
        while(k<x){
            if (x%k==0 && k*k==x){
                System.out.println(k);
//                fact.add(k);
            }
            k++;
        }


    }

}
