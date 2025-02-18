package PlacementDrive;

public class SmallestAndLargestNo {
	public static void main(String[] args) {
	
		int[] arr= {1,2,3,45,6};
		 SmallestLargest(arr);
		 System.out.println();
		
	}
	
	
	public static void SmallestLargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
		
		
		
	}
}


