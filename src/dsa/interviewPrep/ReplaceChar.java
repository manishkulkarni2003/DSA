package dsa.interviewPrep;

public class ReplaceChar {
	
	public static void main(String[] args) {
		
		System.out.println(ReplaceCharacterWithoutStringBuilder("apples",'a','p'));
		
		
	}
		
	
	public static String ReplaceCharacter(String str,char ch1,char ch2) {
		
		int n=str.length();
		StringBuilder res=new StringBuilder();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			if(ch==ch1) {
				res.append(ch2);
			}else if(ch==ch2){
				res.append(ch1);
			}
			else {
				res.append(ch);
			}
		}
		return res.toString();
	}
	
	//without StringBuilder
	
	public static String ReplaceCharacterWithoutStringBuilder(String str,char ch1,char ch2) {
		
		String res="";
		
		for(int i =0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch==ch1) {
				res=res+ch2;
			}
			else if(ch==ch2) {
				res=res+ch1;
			}
			else {
				res=res+str.charAt(i);
			}
		}
		return res;
		
		
	}
}
