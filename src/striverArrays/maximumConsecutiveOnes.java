package striverArrays;

public class maximumConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr= {1,1,0,1,1,1,0,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
		
		
	}
	
	static int findMaxConsecutiveOnes(int[] nums) {
	       int maxi =0;
	       int count =0;
	       for(int i=0;i<nums.length;i++){
	        if(nums[i] ==1){
	            count++;
	            
	        }
	        else{
	            count =0;
	        }
	        maxi =Math.max(maxi,count);
	       } 
	       return maxi;
	    }
}
