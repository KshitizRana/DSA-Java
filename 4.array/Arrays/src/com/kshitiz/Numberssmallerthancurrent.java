package com.kshitiz;
import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class Numberssmallerthancurrent {
    public static void main(String[] args) {
        int[] arr ={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count =0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (j!=i && nums[j]<nums[i]){
                    count++;
                    ans[i]=count;
                }
            }
            count =0;
        }
        return ans;
    }
}
