package dsa.interviewPrep;

import java.util.Arrays;

public class twoStringsPermutation {
	
	public static void main(String[] args) {
	
		String str1="abc";
		String str2="cab";
		System.out.println(CheckPermutation(str1,str2));
		
	}
	
	
	public static boolean CheckPermutation(String str1,String str2) {
		
		//Same As Anagrams Lmao i Fumbled Big Here
		
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray1);
		
		
		
	}
	
}
