package Recursion;

public class palindrome {

	public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str, 0, str.length() - 1));
    }

    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: If start index is greater or equal to end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Check if characters at start and end are equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call moving towards the center of the string
        return isPalindrome(str, start + 1, end - 1);
    }
}
