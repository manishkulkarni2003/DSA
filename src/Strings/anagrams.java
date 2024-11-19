package Strings;

import java.util.Arrays;

public class anagrams {
	public static void main(String[] args) {
		
		String s ="listen";
		String t="silent";
		System.out.println(Anagram(s,t));
		
		
	}
	//brute force Approach 
	static boolean Anagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] sArray =str1.toCharArray();
		char[] tArray =str2.toCharArray();
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		
		return Arrays.equals(sArray, tArray);
	}
}
