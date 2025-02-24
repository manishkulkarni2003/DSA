package cognizant.mathsDsa;

public class factorial {
	public static void main(String[] args) {
		
		System.out.println(facto(5));
		
	}
	public static int facto(int num) {
		
		int res=1;
		for(int i=1;i<=num;i++) {
			res=res*i;
		}
		return res;
	}
}
