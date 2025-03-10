package cognizant.stringsDsa;

import java.util.HashSet;
import java.util.LinkedHashSet;

//remove all Duplicates from the String
public class removeDuplicates {
	public static void main(String[] args) {
		
		String str="Mariogoabooooaa";
		System.out.println(removeDupStringBuilder(str));
		
		
		
	}
	public static String removeDup(String str) {
		String res="";
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			hs.add(str.charAt(i));
		}
		
		for(Character it:hs) {
			res+=it;
		}
		
		return res;
		
		
	}
	public static String removeDupStringBuilder(String str) {
		StringBuilder res=new StringBuilder();
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			hs.add(str.charAt(i));
		}
		
		for(Character it:hs) {
			res.append(it);
		}
		
		return res.toString();
	}
}
