package com.kshitiz;
//https://leetcode.com/problems/two-sum/
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[nums.length];
        for(int i= 0; i<nums.length;i++){
            for (int j =0;j<nums.length;j++){
                if (i!=j && nums[i]+nums[j]==target){
                    int[] ans={i,j};
                    // ans[i+1]=nums[j];
                    return ans;
                }
            }
        }
        return null;
    }
}
