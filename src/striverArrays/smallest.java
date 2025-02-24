package striverArrays;

public class smallest {
	
	public static void main(String[] args) {
		int[] arr={-1,2,5,9,10};
		System.out.println(smallestNumber(arr));
		
	}
	public static int smallestNumber(int[] arr){
		
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		return smallest;
		
		
	}
}





