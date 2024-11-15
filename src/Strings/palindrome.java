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
	
	//optimal and important palindrome
	public static boolean checkPalindrome(String str) {
		
	    // WRITE YOUR CODE HERE	
		if (str == null || str.isEmpty()) {
            return true; // Empty or null string is trivially a palindrome
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two-pointer technique to check for palindrome
        int left = 0, right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
    }
}
