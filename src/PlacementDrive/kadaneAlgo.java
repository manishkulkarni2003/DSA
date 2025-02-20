package PlacementDrive;

public class kadaneAlgo {
	public static void main(String[] args) {
	
		int[] arr= {2,1,-2,3,4,5};
		System.out.println(Kadane(arr));
		
	
	
	}
	public static int Kadane(int[] arr) {
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
