package striverArrays;
import java.util.*;

public class spiralMatrix {
	public static void main(String[] args) {
	}
	
public static int[] spiralMatrix(int[][] matrix) {
	        // Handle edge cases
	        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return new int[0];
	        }

	        int n = matrix.length;    // Number of rows
	        int m = matrix[0].length; // Number of columns

	        int[] result = new int[n * m]; // 1D array to store spiral order
	        int index = 0;

	        int top = 0, left = 0, bottom = n - 1, right = m - 1;

	        // Spiral traversal
	        while (top <= bottom && left <= right) {
	            // Traverse from left to right along the top row
	            for (int i = left; i <= right; i++) {
	                result[index++] = matrix[top][i];
	            }
	            top++; // Move top boundary down

	            // Traverse from top to bottom along the right column
	            for (int i = top; i <= bottom; i++) {
	                result[index++] = matrix[i][right];
	            }
	            right--; // Move right boundary left

	            // Traverse from right to left along the bottom row (if valid)
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    result[index++] = matrix[bottom][i];
	                }
	                bottom--; // Move bottom boundary up
	            }

	            // Traverse from bottom to top along the left column (if valid)
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    result[index++] = matrix[i][left];
	                }
	                left++; // Move left boundary right
	            }
	        }

	        return result;
	    }
	

}
