package cognizant.Pyq;



public class luckyNumber {
	public static void main(String[] args) {
		
		String str="JAMES";
		System.out.println(luckyNumber(str));
		
	}
	public static int luckyNumber(String str) {
		int sum =0;
		for(int i=0;i<str.length();i++) {
			int index=i+1;
			int ascii=(int)str.charAt(i);
			
			if(index%2==1||ascii%2==1) {
				sum+=(index*ascii);
			}
		}
		return sum;
	}
}
