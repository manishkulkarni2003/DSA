package Strings;

import java.util.Arrays;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		String str="Hello World";
		int [] ans=CountVowelsCons(str);
		System.out.println(Arrays.toString(ans));
	}
	static int[] CountVowelsCons(String str) {
		String vowels ="aeiouAEIOU";
		int Consonants=0;
		int vowel_count=0;
		int spaces=0;
		
		for(int i =0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(vowels.indexOf(ch)!=-1) {
				vowel_count++;
			}else if(Character.isLetter(ch)) {
				Consonants++;
			}
			else {
				spaces++;
			}
		}
		return new int[] {vowel_count,Consonants,spaces};
		
	}
}
