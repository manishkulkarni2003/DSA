package cognizant.mathsDsa;

public class armstrongNumber {
	public static void main(String[] args) {
		
		int arm=371;
		if(armStrong(arm)) {
			System.out.println(arm+"is a armStrong Number");
		}else {
			System.out.println(arm+"Is not a armStrong Number");
		}
	
	}
	public static boolean armStrong(int n) {
		int temp=n;
		
		int sum =0;
		
		while(n>0){
			int lastDigit=n%10;
			sum =sum+(lastDigit*lastDigit*lastDigit);
			n=n/10;
		}
//		if(temp==sum) {
//			return true;
//		}
//		return false;
		return temp==sum;
	}
}
