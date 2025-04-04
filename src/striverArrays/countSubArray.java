package striverArrays;

import java.util.HashMap;
import java.util.Map;

public class countSubArray {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,-3,1,1,1,4,-4,5};
		System.out.println(countSubArr(arr,3));
		System.out.println(countSubArray(arr,3));

		
		
	}
	//brute Force Solution
	static int countSubArr(int[]arr,int k) {
		int n=arr.length;
		int count =0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum =0;
				for(int K=i;K<=j;K++) {
					sum =sum+arr[K];
				}
				if(sum==k) {
					count++;
				}
			}
		}
		return count;
		
	}
	//better Solution  actually brute for passing test cases
	static int countSubArray(int[]arr,int k) {
		int n =arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum ==k) {
					count++;
				}
			}
		}
		return count;
	}
	//optimal Solution preFixSum
	public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.    
       int n = arr.length; // size of the given array.
        Map<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - s;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;

    }
}
