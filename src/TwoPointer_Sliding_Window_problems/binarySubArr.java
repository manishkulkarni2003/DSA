package TwoPointer_Sliding_Window_problems;

public class binarySubArr {
	public int numSubarraysWithSum(int[] nums, int goal) {
        return subArr(nums,goal)-subArr(nums,goal-1);
    }
    public static int subArr(int[] nums,int goal){
        if(goal<0)return 0;
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l=l+1;
            }
            count=count+(r-l+1);
            r=r+1;
        }
        return count;
    }
}
