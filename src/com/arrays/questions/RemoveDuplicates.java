package com.arrays.questions;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3};
		System.out.println(removeDuplicates(arr));
	}
	static int removeDuplicates(int nums[]) {
		HashSet<Integer> set =new HashSet<>();
		for(int num:nums) {
			set.add(num);
		}
		return set.size();
	}
}

class Solution {
    public int removeDuplicates(int[] nums) {
        // Check for edge case
        if (nums.length == 0) return 0;
        
        // Initialize the `uniqueIndex` pointer
        int uniqueIndex = 0;
        
        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If we find a new unique element, we place it at `uniqueIndex + 1`
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        
        // The number of unique elements is `uniqueIndex + 1`
        return uniqueIndex + 1;
    }
}
