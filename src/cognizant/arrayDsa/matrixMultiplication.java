package cognizant.arrayDsa;

public class matrixMultiplication {
	
	public static void main(String[] args) {
	int [][] a= {{1,2},{2,3}};
	int [][] b= {{1,2},{2,3}};
	
	int[][] res=new int[2][2];
	
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			res[i][j]=0;
			for(int k=0;k<2;k++) {
				res[i][j]+=a[i][k]*b[j][k];
			}
		}
	}
	
	System.out.println("Resultant Matrix");
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.println(res[i][j]+" ");
		}
		System.out.println();
	}
	
	
	}
}
