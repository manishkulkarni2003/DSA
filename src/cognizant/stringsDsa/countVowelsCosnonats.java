package cognizant.stringsDsa;

public class countVowelsCosnonats {
	public static void main(String[] args) {
		
		String str="manish is@#%% a good 12 boy";
		vowelcounter(str);
		
	}
	
	public static int[] vowelsConsonants(String str) {
		String vowels ="aeiouAEIOU";
		int consonants=0;
		int vowel =0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(vowels.indexOf(ch)!=-1) {
				vowel++;
				
			}else {
				consonants++;
			}
			
		}
		return new int[] {vowel,consonants};
	}
	public static void vowelcounter(String str) {
		int v=0;
		int c=0;
		int ws=0;
		int digit=0;
		int specialCh=0;
		str=str.toLowerCase();
		
		for(int i =0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v++;
			}else if(ch==' ') {
				ws++;
			}else if(Character.isDigit(ch)) {
				digit++;
			}else if(!Character.isLetterOrDigit(ch) ||!Character.isWhitespace(ch)) {
				specialCh++;
			}
			else {
				c++;
			}
			
		}
		System.out.println("Vowels is "+v);
		System.out.println("Consonants"+c);
		System.out.println("whiteSpaces"+ws);
		System.out.println("Digit"+digit);
		System.out.println("Special Ch"+specialCh);
	}
	//if(ch >= 'a' && ch <= 'z') for checking the consonants
}
