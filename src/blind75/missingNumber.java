package blind75;

public class missingNumber {
	public static void main(String[] args) {
		
		int [] arr= {1,2,4,5};
		System.out.println(missingNum(arr));
		
	}
	public static int missingNum(int [] arr) {
		int n=arr.length;
		int sum =0;
		int s=(n*(n+1))/2;
		for(int i=0;i<n-1;i++) {
			sum+=arr[i];
		}
		int res=s-sum;
		return res;
	}
}
