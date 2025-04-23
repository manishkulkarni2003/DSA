package Strings;

import java.util.*;
public class isomorphicStrings {
	public static void main(String[] args) {
		
		String s="egg";
		String t="add";
		System.out.println(isomorphic(s, t));
		
		
		
	}
	public static boolean isomorphic(String s,String t) {
		Map<Character,Character> mapST=new HashMap<>();
		Map<Character,Character> mapTS=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char c1=s.charAt(i);
			char c2=t.charAt(i);
			
			if(mapST.containsKey(c1)) {
				if(mapST.get(c1)!=c2)return false;
			}else {
				mapST.put(c1, c2);
			}
			if(mapTS.containsKey(c2)) {
				if(mapTS.get(c2)!=c1)return false;
			}else {
				mapTS.put(c2, c1);
			}
			
			
		}
		return true;
		
		
		
	}
}
