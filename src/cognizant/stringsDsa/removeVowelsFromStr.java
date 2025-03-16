package cognizant.stringsDsa;

public class removeVowelsFromStr {
	public static void main(String[] args) {
	
		String str="Beatiful";
		System.out.println(removeConsonants(str));
		
		
	}
	public static String removeVowel(String str) {
		
		for(int i =0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'
					) {
				
				str=str.substring(0,i)+str.substring(i+1);
				i--;
				
			}
		}
		return str;
	}
	//another Solution 
	public static String removeVowels(String str) {
		
		String Vowels ="aeiouAEIOU";
		
		StringBuilder res=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Vowels.indexOf(ch)==-1) {
				res.append(ch);
			}
		}
		
		return res.toString();
		
	}
	public static String removeConsonants(String str) {
		StringBuilder res=new StringBuilder();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u') {
				res.append(ch);
			}
		}
		return res.toString();
		
		
	}
	
	
}
