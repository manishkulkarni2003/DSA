package TwoPointer_Sliding_Window_problems;

public class countNoOfNIceSubArrays {
	public int numberOfSubarrays(int[] nums, int k) {
        return countNiceSubArr(nums,k)-countNiceSubArr(nums,k-1);
    }
    public static int countNiceSubArr(int [] nums,int k){
        if(k<0)return 0;
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=(nums[r]%2);
            while(sum>k){
                sum=sum-(nums[l]%2);
                l=l+1;
            }
            count=count+(r-l+1);
            r=r+1;
        }
        return count;
    }
}	
