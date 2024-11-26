package striverArrays;

//Kadane Algorithm
public class maximumSumArray {
	public static void main(String[] args) {
		
		int[] arr= {1,2,-4,3,7,5};
		System.out.println(maxiOptimalArr(arr));
		
	}
	//not all test cases will be passed
	static int maxiSumArr(int[]arr) {
		int maxi =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum =0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				maxi=Math.max(maxi, sum);
			}
		}
		return maxi;
	}
	//better solution  -->Still all cases not passed
	static int maxiBetterSumArr(int[]arr) {
		int maxi =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				
				maxi=Math.max(maxi, sum);
			}
		}
		return maxi;
	}
	//optimal Solution The kadane Algorithm
	static int maxiOptimalArr(int[] arr) {
		int maxi =Integer.MIN_VALUE;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>maxi) {
				maxi=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return maxi;
	}
}
