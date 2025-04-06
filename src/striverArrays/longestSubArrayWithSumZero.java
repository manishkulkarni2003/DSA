package striverArrays;
import java.util.*;
public class longestSubArrayWithSumZero {
	public static void main(String[] args) {
	}
	public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int maxi=0;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }else if(mpp.get(sum)!=null){
                maxi=Math.max(maxi,i-mpp.get(sum));
            }else{
                mpp.put(sum,i);
            }
        }
        return maxi;
    }
}
