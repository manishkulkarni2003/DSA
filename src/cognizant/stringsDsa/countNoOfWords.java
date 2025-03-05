package cognizant.stringsDsa;

public class countNoOfWords {
	public static void main(String[] args) {
		
		String str="HI Iam Manish Kulkarni";
		System.out.println("The No of Words are:"+noOfWords(str));
		
		
	}
	public static int noOfWords(String str) {
		
		int spaces=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spaces=spaces+1;
			}
		}
		return spaces+1;
	}
}
