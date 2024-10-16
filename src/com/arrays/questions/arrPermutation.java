package com.arrays.questions;
/*Given a zero-based permutation nums (0-indexed),
 *  build an array ans of the same length
 *   where ans[i] = nums[nums[i]] 
 *   for each 0 <= i < nums.length and return it.

A zero-based permutation nums
 is an array of distinct integers
  from 0 to nums.length - 1 (inclusive).*/
public class arrPermutation {
	public int[] buildArray(int[] nums) {
        int n=nums.length;//storing the input of arr in n
        int[] ans =new int[n];//storing the values of input in new arr of ans
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];//index of ans =nums of nums index
        }
        return ans;

    }
}
//https://chatgpt.com/share/670f78e4-5e78-8007-8458-4d23b0ff2216
