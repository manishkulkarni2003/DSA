package PlacementDrive;

public class factorial {
	public static void main(String[] args) {
		int num=5;
		Factorial(num);
		
	}
	
	public static void Factorial(int n) {
		
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		System.out.println(res);
	}
	
}
