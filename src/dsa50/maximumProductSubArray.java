package dsa50;

public class maximumProductSubArray {
	public static void main(String[] args) {
	int[] arr= {2,3,-2,4};
	System.out.println(maxProduct(arr));
	
	}
	//not an prefect solution only passes 38 test cases
	static int maxProduct(int[] nums) {
	        int maxProduct=0;
	        
	        
	        for(int i =0;i<nums.length-1;i++){
	            int max=nums[i];
	            int min =nums[i+1];
	            int result=max*min;
	            if(result>maxProduct){
	                maxProduct =result;
	            }
	            return result;
	        }
	        return -1;
	    }
	}

//actual solution
/*
 * class Solution {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // Swap maxSoFar and minSoFar if current number is negative
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update maxSoFar and minSoFar
            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            // Update result with the current max
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
*/

