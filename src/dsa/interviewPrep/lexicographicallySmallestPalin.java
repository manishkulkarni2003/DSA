package dsa.interviewPrep;

public class lexicographicallySmallestPalin {
	
	public static void main(String[] args) {
	System.out.println(lexicographicallySmallestPalindrome("abca"));
	
	}
	
	public static String lexicographicallySmallestPalindrome(String str) {
		char[] chars =str.toCharArray();
		int n=chars.length;
		
		
		for(int i=0;i<n/2;i++) {
			char left =chars[i];
			char right=chars[n-i-1];
			if(left!=right) {
				chars[i]=chars[n-i-1]=(char)Math.min(left, right);
			}
		}
		
		return new String(chars);
		
		
		
		
	}
}
