package com.kshitiz;
// Q. https://leetcode.com/problems/running-sum-of-1d-array/description/
public class Runningsum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for (int i : runningSum(nums)) {
            System.out.print(i+", ");
        }

    }
    static int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[(i-1)] + nums[i];
        }
        return nums;
    }
}
