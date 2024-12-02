package striverArrays;

public class setMatrixZeroes {
	public static void main(String[] args) {
		
	}
	    public void setZeroes(int[][] matrix) {
	        int n = matrix.length;   // Number of rows
	        int m = matrix[0].length;  // Number of columns
	        
	        // First, mark the rows and columns that need to be set to zero
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (matrix[i][j] == 0) {
	                    markRow(matrix, n, m, i);  // Mark the row
	                    markCol(matrix, n, m, j);  // Mark the column
	                }
	            }
	        }
	        
	        // Second, set the marked rows and columns to zero
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (matrix[i][j] == -1) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	    }

	    // Helper method to mark the entire row
	    static void markRow(int[][] matrix, int n, int m, int i) {
	        for (int j = 0; j < m; j++) {
	            if (matrix[i][j] != 0) {
	                matrix[i][j] = -1;  // Mark as -1 to indicate it should be set to zero
	            }
	        }
	    }

	    // Helper method to mark the entire column
	    static void markCol(int[][] matrix, int n, int m, int j) {
	        for (int i = 0; i < n; i++) {
	            if (matrix[i][j] != 0) {
	                matrix[i][j] = -1;  // Mark as -1 to indicate it should be set to zero
	            }
	        }
	    }
	    
//better solution
	    static void setZeros(int[][] matrix) {
	    	int n=matrix.length;
	    	int m =matrix[0].length;
	    	int[] row =new int[n];
	    	int[] col=new int[m];
	    	
	    	for(int i=0;i<n;i++) {
	    		for(int j=0;j<m;j++) {
	    			if(matrix[i][j]==0) {
	    				row[i]=1;
	    				col[j]=1;
	    			}
	    		}
	    	}
	    	for(int i=0;i<n;i++) {
	    		for(int j=0;j<m;j++) {
	    			if(row[i]==1 || col[j]==1) {
	    				matrix[i][j]=0;
	    			}
	    		}
	    	}
	    }
}


