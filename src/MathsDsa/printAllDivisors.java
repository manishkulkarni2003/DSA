package MathsDsa;

public class printAllDivisors {
		public static void main(String[] args) {
			
			int n =7;
			Divisor(n);
			
		
		}
	
	static void Divisor(int n) {
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+":is the Divisors");
			}
			
		}
	}
}
