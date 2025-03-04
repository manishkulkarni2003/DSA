package cognizant.mathsDsa;

public class calculateProductofDigit {
	public static void main(String[] args) {
		
		System.out.println(productDigit(234));
		
	}
	public static int productDigit(int n) {
		int prod=1;
		
		while(n>0) {
			int Ld=n%10;
//			prod=prod*Ld;
			prod*=Ld;
			n=n/10;
		}
		return prod;
	}
}
