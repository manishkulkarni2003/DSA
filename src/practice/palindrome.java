package practice;

public class palindrome {
	public static void main(String[] args) {
		int n=747;
		System.out.println(palindromeNumber(n));
	}
	public static boolean palindromeNumber(int n) {
		int temp=n;
		int res=0;
		while(n>0) {
			int lastDigit=n%10;
			res=(res*10)+lastDigit;
			n=n/10;
		}
		return temp==res;
	}
}
