package Strings;

public class removeSpaces {
	
	public static void main(String[] args) {
		
		String name ="Ma n ish";
		StringBuilder str =new StringBuilder("M a n is h");
		
		System.out.println(removeSpace(name));
		System.out.println(replaceSpaces(str));
		
		
	}
	public static String removeSpace(String str) {
		String Spaces =" ";
		StringBuilder res =new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Spaces.indexOf(ch)==-1) {
				res.append(ch);
			}
		}
		
		
		return res.toString();
		
	}
	
	//remove Spaces And Replace With "@40";CodeStudio Question
	public static StringBuilder replaceSpaces(StringBuilder str) {
		StringBuilder res =new StringBuilder();
		for(int i =0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch==' ') {
				res.append("@40");
			}
			else {
				res.append(ch);
			}
		}
		return res;
	}
	
}
