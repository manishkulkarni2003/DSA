package cognizant.stringsDsa;

public class detectCapital {
	public static void main(String[] args) {
		
		String str="USA";
		System.out.println(detectCaps(str));
	}
	public static boolean detectCaps(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				return true;
			}
		}
		return false;
	}
}
