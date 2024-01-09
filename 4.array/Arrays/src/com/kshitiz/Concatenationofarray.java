package com.kshitiz;
// https://leetcode.com/problems/concatenation-of-array/description/
public class Concatenationofarray {
    public static void main(String[] args) {
       int[] nums = {1,2,1} ;
       getConcatenation(nums);
    }
    static int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[2*l];
        for(int i = 0; i < l; i++){
            ans[i] = nums[i];
            ans[i+l] = nums[i];
        }
        for (int j =0; j<ans.length;j++){
            System.out.print(ans[j]);
        }
        return ans;
    }
}
