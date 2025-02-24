package cognizant.mathsDsa;

public class printNPrime {
	
	public static void main(String[] args) {
	
	printNPrimeNumbers(105);
	
	}
	
	
	public static void printNPrimeNumbers(int num) {
		
		if(num<2) {
			System.out.println("Number is Less than 2");
			return;
		}
		
		for(int i=2;i<num;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
		
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
