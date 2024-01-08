package com.kshitiz;

public class Concatenationofarray {
    public static void main(String[] args) {
       int[] nums = {1,2,1} ;
       getConcatenation(nums);
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n = 0;
        while (n < (nums.length - 1)) {
            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[i];
            }
            n++;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        return ans;


    }
}