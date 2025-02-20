package PlacementDrive;

public class palindromeString {
	
	public static void main(String[] args) {
	
	String str1="Manish";
	if(isPalindrome(str1)) {
		System.out.println(str1+":It is A Palindrome");
	}else {
		System.out.println(str1+":Is Not a palindrome");
	}
	
	}
	
	public static boolean isPalindrome(String str) {
		
		if(str==null || str.length()==0) {
			return true;
		}
		str=str.toLowerCase();
		for(int i=0;i<str.length()/2;i++) {
			char start=str.charAt(i);
			char end=str.charAt(str.length()-i-1);
			
			if(start!=end) {
				return false;
			}
		}
		
		return true;
		
		
		
		
	}
}
