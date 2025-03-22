package cognizant.mathsDsa;
import java.util.Scanner;
public class permutationAndCombination {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		
		int num=fact(n);
		int dem=fact(n-r);
		System.out.println(num/dem);
		
	}
	public static int fact(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		return res;
				}
}
