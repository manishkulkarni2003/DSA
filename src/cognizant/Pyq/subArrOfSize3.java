package cognizant.Pyq;

public class subArrOfSize3 {
	
	public static void main(String[] args) {
	int [] arr= {1,2,1,3,5,2,4,2};
	int K=3;
	System.out.println(subArrOf3(arr, K));
	}
	
	public static int subArrOf3(int [] arr,int K) {
		int n=arr.length;
		if(n==0) {
			return -1;
		}
		int len =0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<j;k++) {
					sum+=arr[k];
					
					
					
				}
				if(sum==K) {
					len=Math.max(len, j-i+1);
				}
				
			}
		}
		return len;
	}
	public static int subOf3(int[] arr,int k) {
		int n=arr.length;
		if(n==0) {
			return -1;
		}
		int len =0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n-1;j++) {
				sum+=arr[j];
				
				if(sum==k) {
					len=Math.max(len,j-i+1);
				}
			}
			
			
		}
		return len;
		
		
		
		
		}
}
