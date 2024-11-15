package striverArrays;

public class longestSubArraySum {
	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,1,1,2,1,2,1,1,1};
		int k=3;
		System.out.println(subArraySum(arr,k));
		
		
		
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
}
