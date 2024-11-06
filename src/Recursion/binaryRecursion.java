package Recursion;

public class binaryRecursion {
	public static void main(String[] args) {
	int[] arr= {1,2,5,56,34,3};
	int target =34;
	System.out.println(Search(arr,target,0,arr.length-1));
	}
	static int Search(int arr[],int target,int s,int e) {
		
		if(s>e) {
			return -1;
		}
		int m =s+(e-s)/2;
		
		if(arr[m] ==target) {
			return m;
		}
		if(target<arr[m]) {
			return Search(arr,target,s,m-1);
		}
		return Search(arr,target,m+1,e);
		
		
		
	}
}//make sure to return the res of a function call of the return type

