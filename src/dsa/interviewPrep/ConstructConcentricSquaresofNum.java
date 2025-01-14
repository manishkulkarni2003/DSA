package dsa.interviewPrep;

public class ConstructConcentricSquaresofNum {
		
	public static void main(String[] args) {
		
		ConstrcutConcentricSquaresOfNumbers(3);
		
		
	}
	
	public static void ConstrcutConcentricSquaresOfNumbers(int n) {
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
   