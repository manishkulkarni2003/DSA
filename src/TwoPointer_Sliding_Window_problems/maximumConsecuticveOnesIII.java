package TwoPointer_Sliding_Window_problems;
import java.util.*;
/*Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.*/
public class maximumConsecuticveOnesIII {
	public static void main(String[] args) {
	}
	 public int longestOnesBetter(int[] nums, int k) {
	        int maxLen=0;
	        int right=0;
	        int left=0;
	        int zeros=0;
	        while(right<nums.length){
	            if(nums[right]==0)zeros++;
	            while(zeros>k){
	                if(nums[left]==0){
	                    zeros--;
	                    
	                }
	                left++;
	            }
	            if(zeros<=k){
	                int len=right-left+1;
	                maxLen=Math.max(maxLen,len);
	            }
	            right++;
	        }
	        return maxLen;
	    }
	 public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
			// Write your code here.
			int maxLen=0;
			int r=0;
			int l=0;
			int zero=0;
			while(r<arr.size()){
				if(arr.get(r)==0) zero++;
				if(zero>k){
					if(arr.get(l)==0)zero--;
					l++;
				}
				if(zero<=k){
					int len=r-l+1;
					maxLen=Math.max(maxLen,len);
				}
				r++;
			}
			return maxLen;
		}
}
