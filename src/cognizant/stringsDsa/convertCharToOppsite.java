package cognizant.stringsDsa;

public class convertCharToOppsite {
	public static void main(String[] args) {
		
		String str="Hello";
		System.out.println(convertToOpp(str));
		
	}
	public static String convertToOpp(String str) {
		StringBuilder res=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				res.append(Character.toLowerCase(ch));
				
			}else {
				res.append(Character.toUpperCase(ch));
			}
		}
		
		return res.toString();
		
	}
	//Optimised Solution to be Solved
}	
