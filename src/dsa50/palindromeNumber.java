package dsa50;

public class palindromeNumber {
	public static void main(String[] args) {
		
		int n =121;
		System.out.println(palidrome(n));
		
	}
	static boolean palidrome(int n) {
		int temp =n;
		int palindrome =0;
		while(n>0) {
			int rem =n%10;
			palindrome =(palindrome *10)+rem;
			n=n/10;
			
		}
		return temp ==palindrome;
	}

}
