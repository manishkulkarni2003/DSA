package Strings;

public class palindrome {
	public static void main(String[] args) {
	
		String name ="Madam";
		System.out.println(isPalindrome(name));
		//true 
		String a ="Manish";
		System.out.println(isPalindrome(a));
		//false
	}
	static boolean isPalindrome(String str) {
		if(str ==null || str.length() ==0) {
			return true;
		}
		str =str.toLowerCase();
		for(int i =0;i<=str.length() /2;i++) {
			char start = str.charAt(i);
			char end =str.charAt(str.length()-1-i);
			
			if(start != end) {
				return false;
			}
		}
		return true;
	}
}
