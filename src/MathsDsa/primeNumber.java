package MathsDsa;

public class primeNumber {
	public static void main(String[] args) {
			
	
		int n =4;
		Prime(n);
		
		
	}
	static void Prime(int n) {
		int count =0;
		for(int i =1;i<=n;i++) {
			if(n%i ==0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.println(n+":Is a Prime Number");
		}
		else {
			System.out.println(n+":Is not a Prime NUmber ");
		}
	}
}
