package patterns;

public class pattern {
	public static void main(String[] args) {
		
		pattern1(5);
		pattern2(4);
		
		pattern3(5);
		pattern4(5);
		
		pattern5(10);
	}
	
	static void pattern1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pattern2(int n) {
		for(int row=1;row<=n;row++) {
			//for every row run col
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			//when one row is printed we need to add a newline
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n+1-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		for(int row=1;row<=2*n;row++) {
			int c=3456789;
			for(int col=0;col<c;col++) {
				System.out.print("*");
				
				}
			System.out.println();
			}
			
			
	}
	
}
