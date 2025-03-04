package cognizant.mathsDsa;

public class LeapYear {
	public static void main(String[] args) {
		int n=2000;
		if(LeapYr(n)) {
			System.out.println(n+"is a Leap Year");
		}else {
			System.out.println(n+"Is not a Leap Year");
		}
	}
	public static boolean LeapYr(int n) {
		if(n%4==0) {
			return true;
		}else if(n%400==0) {
			return true;
		}else if(n%100==0) {
			return false;
		}
		
		return false;
	}
}
