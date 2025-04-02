package striverArrays;

import java.util.Arrays;

public class findTheMissingNumber {
	public static void main(String[] args) {
	int[] arr= {1,2,4,5};
	int n=arr.length;
	
	System.out.println(missingNumberOptimal2(arr,n));
	
	
	}
	public static int missingNumber(int[] arr) {
		int n=arr.length;
		for(int i=1;i<=n;i++) {
			int flag=0;
			for(int j=0;j<n-1;j++) {
				if(arr[j]==i) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				return i;
			}
		}
		return -1;
	}
	public static int missingNumberBetter(int[] arr) {
		int n=arr.length;
		int [] hash=new int[n+1];
		for(int i=0;i<n-1;i++) {
			hash[arr[i]]++;
		}
		for(int i=1;i<=n;i++) {
			if(hash[i]==0) {
				return i;
			}
		}
		return -1;
		
	}
	public static int missingNumberOptimal(int[]arr) {
		int n=arr.length;
		int sum=(n*(n+1))/2;
		int s=0;
		for(int i=0;i<n-1;i++) {
			s+=arr[i];
		}
		int missingNumber=sum-s;
		return missingNumber;
	}
	public static int missingNumberOptimal2(int []a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }

}
