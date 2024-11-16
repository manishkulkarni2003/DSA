package striverArrays;

import java.util.HashMap;

public class longestSubArraySum {
	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,1,1,2,1,2,1,1,1};
		int k=3;
		System.out.println(subArraySum4(arr,k));
		
		
		
	}
	//brute force approach 1
	static int subArraySum(int[]arr,long k) {
		int n=arr.length;
		int len=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				long sum =0;
				for(int K=i;K<=j;K++) {
					sum+=arr[K];
				}
				if(sum ==k) {
					len =Math.max(len,j-i+1);
				}
			}
		}
		return len;
	}
	//brute force 2
	static int subArraySum2(int[] arr,long k) {
		int n =arr.length;
		int len =0;
		for(int i =0;i<n;i++) {
			long sum =0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum ==k) {
					len=Math.max(len, j-i+1);
				}
			}
			
		}
		return len;
		
	}
	//better solution //hashing
	static int subArraySum3(int [] arr,long k) {
		int n =arr.length;
		long sum=0;
		int maxlen=0;
		HashMap<Long,Integer> preSumMap=new HashMap<>();
		for(int i =0;i<n;i++) {
			sum+=arr[i];
			
			if(sum ==k) {
				maxlen =Math.max(maxlen,i+1);
			}
			long rem =sum-k;
			if(preSumMap.containsKey(rem)) {
				int len = i - preSumMap.get(rem);
                maxlen = Math.max(maxlen, len);
			}
			if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
			
		}
		return maxlen;
	}
	//optimal solution
	static int subArraySum4(int[]arr,int k) {
		int n =arr.length;
		int right=0;
		int left=0;
		long sum=arr[0];
		int maxlen=0;
		while(right<n) {
			while(left<=right && sum>k) {
				sum-=arr[left];
				left++;
			}
			if(sum ==k) {
				maxlen =Math.max(maxlen, right-left+1);
			}
			right++;
			if(right<n) sum+=arr[right];
		}
		return maxlen;
	}
}
