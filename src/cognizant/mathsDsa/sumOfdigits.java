package cognizant.mathsDsa;

public class sumOfdigits {
	public static void main(String[] args) {
	
	System.out.println(sumDigits(123));
	
	}
	
	public static int sumDigits(int num) {
		int sum=0;
		
		while(num>0) {
			int rem =num%10;
			num=num/10;
			sum+=rem;
			
			}
		
		
		return sum;
		
	}
}
