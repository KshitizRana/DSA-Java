package com.kshitiz;
//Q. https://leetcode.com/problems/concatenation-of-array/description/

public class Arrayfrompermutation {
    public static void main(String[] args) {
        int[] nums= {0,2,1,5,3,4};
        buildArray(nums);
    }
    static int[] buildArray(int[] nums) {
        int[] ans = new int[6];
        for (int i = 0; i<nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        for (int i=0;i<nums.length; i++){
            System.out.println(ans[i]);
        }
        return ans;
    }
}
