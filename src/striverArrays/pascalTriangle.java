package striverArrays;
import java.util.*;
public class pascalTriangle {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int N = sc.nextInt();

    int[][] result = pascalTriangle(N);

    System.out.println("Pascal's Triangle:");
    for (int[] row : result) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    sc.close();
	
}
public static int[][] pascalTriangle(int N) {
	        int[][] triangle = new int[N][];
	        
	        for (int row = 0; row < N; row++) {
	            triangle[row] = new int[row + 1];
	            triangle[row][0] = 1; // first element is always 1
	            
	            for (int col = 1; col < row; col++) {
	                triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
	            }
	            
	            triangle[row][row] = 1; // last element is always 1
	        }
	        
	        return triangle;
	    }
}

