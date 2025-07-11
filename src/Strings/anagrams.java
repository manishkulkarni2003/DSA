package Strings;

import java.util.Arrays;

public class anagrams {
	public static void main(String[] args) {
		
		String s ="listen";
		String t="silent";
		System.out.println(AnagramString(s,t));
		
		
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
	public static boolean AnagramString(String str1,String str2) {
		if(str1.length()!=str2.length()) return false;
		int[] freq=new int[26];
		for(int i =0;i<str1.length();i++) {
			freq[str1.charAt(i)-'a']++;
			freq[str2.charAt(i)-'a']--;

		}
		for(int count:freq) {
			if(count!=0) {
				return false;
			}
		}
		return true;
	}
}
