package striverArrays;

public class largestElement {
	public static void main(String[] args) {
		
		int[] arr= {1,32,4,5,7};
		System.out.println(Largest(arr));
		
	}
	static int Largest(int[] arr) {
		int max =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		return max;
	}
}
