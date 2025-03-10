package cognizant.AlogrithmsDsa;

public class linearSearch {
	public static void main(String[] args) {
		int [] arr= {1,4,23,57,7};
		int x=23;
		System.out.println(linearSearch(arr, x));
		
		
	
	}
	public static int linearSearch(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
