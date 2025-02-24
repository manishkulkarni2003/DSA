package cognizant.arrayDsa;

public class leftRotateArrayByk {
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int k=4;
		RotatetoLeft(arr, k);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}
	
	public static void RotatetoLeft(int[]arr,int k) {
		int n=arr.length;
		
		if(n==0) {
			return;
		}
		k=k%n;//(No change here, but this ensures k doesn’t exceed array size)
		if(k>n) {
			return;
		}
		//Step 1: Copying the first k elements into temp[]
		int[] temp =new int[k];
		//copying k elements in temp arr
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}
		//storing the elements which are not from k
//		 Shifting the remaining elements left by k positions
		//arr[0] = arr[2] = 3  arr[1] mein store hoga =arr[1+2=3]
		for(int i=0;i<n-k;i++) {
			arr[i]=arr[i+k];
		}
		//after this iteration
		//arr = {3, 4, 5, 6, 7, 6, 7}
		
//		arr[5] = temp[0] = 1
//		arr[5]=temp[5-5+2]
		for(int i=n-k;i<n;i++) {
			arr[i]=temp[i-n+k];
		}
		
		
		
	}
}
