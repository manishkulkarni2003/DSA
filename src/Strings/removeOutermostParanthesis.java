package Strings;

public class removeOutermostParanthesis {
	public static void main(String[] args) {
		
		System.out.println(removeOutermostParanthesis.removeOutermost("(()())(())"));
		
	}
	static String removeOutermost(String s) {
		StringBuilder str=new StringBuilder();
		int counter =0;
		for(int i =0;i<s.length();i++) {
			char ch =s.charAt(i);
			
			if(ch =='(') {
				if(counter>0) {
					str.append(ch);
				}
				counter++;
			}
			else {
				counter--;
				if(counter>0) {
					str.append(ch);
				}
			}
		}
		return str.toString();
	}
}	
