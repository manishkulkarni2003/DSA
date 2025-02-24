package cognizant.mathsDsa;

public class prime {
	public static void main(String[] args) {
		
		int num =4;
		if(PrimeNumber(num)) {
			System.out.println(num+"The Number is a Prime Number");
		}else {
			System.out.println(num+"This Number is Not Prime");
		}
		
	}
	
	public static boolean PrimeNumber(int num) {
		
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
