package striverArrays;

public class secondLargestElement {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		System.out.println(secondLargest(arr));
		
	}
	static int secondLargest(int[] arr) {
		int largest =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		int secondLargest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
		
		
		
	}
}
