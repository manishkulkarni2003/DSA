package Strings;

//remove All Vowels For the String
public class removeVowels {
	public static void main(String[] args) {
		
		String str="DoreaMon";
		removeVow(str);
		
	}
	
	
	static void removeVow(String str) {
		String Vowels ="aeiouAEIOU";
		StringBuilder res=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			
			if(Vowels.indexOf(ch)==-1) {
				res.append(ch);
			}
			
			
		}
		
		System.out.println("Strings Without Vowels:"+" "+res.toString());
	}
}
