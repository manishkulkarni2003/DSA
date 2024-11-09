package patterns;

public class patternStriver {
	
	public static void main(String[] args) {
		
		pattern22(4);
		
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
			for(int col =1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		for(int row=1;row<=n;row++) {
			//for(int col=row;col<=n;col++) //also works fine
			for(int col =1;col<=n-row+1;col++) {
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
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	static void pattern6(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=row;col<=n;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	static void pattern7(int n) {
		for(int row =1;row<=n;row++) {
			for(int col=1;col<=n-row+1;col++) {
				System.out.print(col);
			}
			System.out.println(" ");
		}
	}
	static void pattern8(int n) {
		for(int row=0;row<n;row++) {
			for(int col =0;col<n-row-1;col++) {
				System.out.print(" ");
				
			}
			for(int col=0;col<2*row+1;col++) {
				System.out.print("*");
			}
			for(int col=0;col<n-row-1;col++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
	static void pattern9(int n) {
		for(int row=0;row<n;row++) {
			for(int col =0;col<row;col++) {
				System.out.print(" ");
				
			}
			for(int col=0;col<2*n-(2*row+1);col++) {
				System.out.print("*");
			}
			for(int col=0;col<row;col++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
	static void pattern10(int n) {
		for(int row=1;row<=2*n-1;row++) {
			int stars =row;
			if(row>n) {
				stars=2*n-row;
			}
			for(int col=1;col<=stars;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern11(int n) {
		int start=1;
		for(int row=0;row<n;row++) {
			if(row%2==0) {
				start=1;
			}
			else {
				start=0;
			}
			for(int col=0;col<=row;col++) {
				System.out.print(start+" ");
				start=1-start;
			}
			System.out.println();
					
		}
	}
	static void pattern12(int n) {
		int space=2*(n-1);
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			for(int col=1;col<=space;col++) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			System.out.println();
			space=space-2;
			
		}
	}
	static void pattern13(int n) {

		int num=1;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
	}
	static void pattern14(int n) {
		for(int row=0;row<n;row++) {
			for(char ch='A';ch<='A'+row;ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	static void pattern15(int n) {
		for(int row=0;row<n;row++) {
			for(char ch='A';ch<='A'+(n-row-1);ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	static void pattern16(int n) {
		for(int row=0;row<n;row++) {
			char ch=(char) ('A'+ row);
			for(int col=0;col<=row;col++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern17(int n) {
		for(int row=0;row<n;row++) {
			for(int col=0;col<n-row-1;col++) {
				System.out.print(" ");
			}
			char ch='A';
			int breakPoint =(2*row+1)/2;
			for(int col =1;col<=2*row+1;col++) {
				System.out.print(ch);
				if(col<=breakPoint) {
					ch++;
				}
				else {
					ch--;
				}
			}
			for(int col=0;col<n-row-1;col++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void pattern18(int n) {
		for(int row=0;row<n;row++) {
			for(char ch=(char) ('E'-row);ch<='E';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	static void pattern19(int n) {
		int initialSpace =0;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n-row;col++) {
				System.out.print("*");
			}
			for(int col=0;col<initialSpace;col++) {
				System.out.print(" ");
			}
			for(int col=0;col<n-row;col++) {
				System.out.print("*");
			}
			initialSpace+=2;
			System.out.println();
		}
		initialSpace=2 *n-2;
		for(int row=0;row<n;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print("*");
			}
			for(int col=0;col<initialSpace;col++) {
				System.out.print(" ");
			}
			for(int col=0;col<=row;col++) {
				System.out.print("*");
			}
			initialSpace-=2;
			System.out.println();
		}
	}
	static void pattern20(int n) {
		int spaces =2*n-2;
		for(int row=1;row<=2*n-1;row++) {
			int stars =row;
			if(row>n) {
				stars=2*n-row;
			}
			for(int col=1;col<=stars;col++) {
				System.out.print("*");
			}
			for(int col=1;col<=spaces;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=stars;col++) {
				System.out.print("*");
			}
			if(row<n) {
				spaces-=2;
				
			}
			else {
				spaces+=2;
			}
			System.out.println();
		}
	}
	
	static void pattern21(int n) {
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				if(row==0 || col==0|| row==n-1 ||col ==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void pattern22(int n) {
		for(int row=0;row<2*n-1;row++) {
			for(int col=0;col<2*n-1;col++) {
				int top=row;
				int left =col;
				int right =(2*n-2)-col;
				int down =(2*n-2)-row;
				int value = n - Math.min(Math.min(top, down), Math.min(left, right));
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
