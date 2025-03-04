package cognizant.mathsDsa;

public class sumOfCube {
	public static void main(String[] args) {
		
		int n=1;
		int m=3;
		System.out.println(sumOfCubeSolution(n, m));
	}
	public static int sumOfCubeSolution(int n,int m) {
		int sum =0;
		for(int i=n;i<=m;i++) {
			int cube =i*i*i;
			sum+=cube;
		}
		return sum;
	}
}
