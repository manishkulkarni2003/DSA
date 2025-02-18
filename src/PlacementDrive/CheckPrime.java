package PlacementDrive;

public class CheckPrime {
	
	public static void main(String[] args) {
		
		int num=4;
		if(prime(num)==true) {
			System.out.println(num+": Number is Prime");
		}else {
			System.out.println(num+": is not Prime");
		}
		
		
		
	}
	
	
	public static boolean prime(int num) {
		if(num<=1) return false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
