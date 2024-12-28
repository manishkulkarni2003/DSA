package striverArrays;

public class countSubArray {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,-3,1,1,1,4,-4,5};
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
	//better Solution 
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
}
