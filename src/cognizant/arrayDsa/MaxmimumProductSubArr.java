package cognizant.arrayDsa;

import java.util.ArrayList;

public class MaxmimumProductSubArr {
	public static void main(String[] args) {
	int[] arr= {-2,-3,4,-1,-2,1,5,-3};
	ArrayList<Integer> nums=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		nums.add(arr[i]);
	}
	System.out.println(maximumProduct(nums));
	
	
	}
	public static int maximumProdSub(int[] arr) {
		int maxi =Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int product=1;
				for(int k=i;k<=j;k++) {
					product*=arr[k];
					maxi=Math.max(product, maxi);
				}
			}
		}
		return maxi;
	}
	public static int maxiProdSubarrBetter(int[] arr) {
		int maxi=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			int prod=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				maxi=Math.max(prod, maxi);
				prod*=arr[j];
				
			}
		}
		return maxi;
	}
	public static int maximumProduct(ArrayList<Integer> arr) {
		// Write your code here.
		int maxSoFar=arr.get(0);
		int minSoFar=arr.get(0);
		int result=arr.get(0);

		for(int i=1;i<arr.size();i++){
			int current =arr.get(i);
			if(current<0){
				int temp=maxSoFar;
				maxSoFar=minSoFar;
				minSoFar=temp;
			}

			maxSoFar=Math.max(current,maxSoFar*current);
			minSoFar=Math.min(current,minSoFar*current);

			result=Math.max(result,maxSoFar);
		}

		return result;
	}
}
