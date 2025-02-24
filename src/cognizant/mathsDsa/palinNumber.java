package cognizant.mathsDsa;

public class palinNumber {
		
	
	public static void main(String[] args) {
		int num =1211;
		if(isPalindrome(num)) {
			System.out.println(num+":It is a Palindrome");
		}else {
			System.out.println(num+":Is not a Palindrome");
		}
		
		
	}
	
	public static boolean isPalindrome(int num) {
		
		int temp=num;
		int reverse=0;
		while(num>0) {
			int rem =num%10;
			num=num/10;
			reverse=(reverse*10)+rem;
		}
		if(reverse==temp) {
			return true;
		}
		return false;
	}
}
