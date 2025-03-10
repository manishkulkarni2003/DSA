package cognizant.mathsDsa;

public class sumOffirstNNaturalNumber {
	public static void main(String[] args) {
		int n=27;
		System.out.println(sumOfnNatural(1, 27, n));
		}
	public static int sumOfNnum(int n) {
		
		int ans =(n/2)*(1+n);
		
		return ans;
	}
	public static float sumOfnNatural(int n,float a,float d) {
		float sum =(float) ((n/2.0)*(2.0*a+(n-1)*d));
		return sum;
	}
}
