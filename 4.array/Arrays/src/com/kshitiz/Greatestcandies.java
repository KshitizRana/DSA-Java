package com.kshitiz;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greatestcandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra =3;
        kidsWithCandies(candies,extra);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>max){
                max = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                result.add(true);
            } else{

                result.add(false);
            }
        }
        for (int i=0;i<5;i++){
            System.out.println(result.get(i));
        }
        return result;
    }


}
