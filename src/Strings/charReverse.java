package Strings;

public class charReverse {
	public static void main(String[] args) {
		char [] str= {'l','a','n'};
		reverseString(str);
		System.out.println(str);
		
		
	}
	static void reverseString(char[] s) {
	       int left =0;
	       int right =s.length-1;
	       while(left<right){
	        char temp =s[left];
	        s[left] =s[right];
	        s[right]=temp;
	        left++;
	        right--;
	       }

	        
	    }
}
