package cognizant.mathsDsa;

public class countDigits {
	
	public static void main(String[] args) {
	
	System.out.println(digitCount(56767));
	
	}
	
	public static int digitCount(int num) {
		
		int count=0;
		int rem=0;
		
		while(num>0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		return count;
		
	}
}
