package Strings;

public class palinNUM {
	
	public static void main(String[] args) {
	
	int[] arr = {1,2,1};
	System.out.println(isPalindrome(arr));
	
	}
	static boolean isPalindrome(int[] arr) {
		for(int i=0;i<=arr.length/2;i++) {
			int start =0;
			int end =arr.length-1;
			if(start !=end) {
				return false;
			}
		}
		return true;
	}
}
