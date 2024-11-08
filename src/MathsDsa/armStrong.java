package MathsDsa;

public class armStrong {
	public static void main(String[] args) {
		
		int n =371;
		System.out.println(armsStrongNumber(n));
		
		
		
	}
	static boolean armsStrongNumber(int n) {
		int temp =n;
		int sum =0;
		while(n>0) {
			int rem =n%10;
			sum =sum +(rem * rem * rem);
			n =n /10;
		}
		return temp ==sum;
	}
}
