package cognizant.stringsDsa;

public class maximumOccuringCharacter {
	public static void main(String[] args) {
		
		String str="Lmaaooo";
		System.out.println(maxOccurChar(str));
		
		
	}
	//Brute Force Method
	public static char maxOccurChar(String str) {
		
		char ans ='a';
		int maxFreq=0;
		int n=str.length();
		
		int count[] =new int[256];
		
		for(int i=0;i<n;i++) {
			count[str.charAt(i)]++;
			if(count[str.charAt(i)]>maxFreq) {
				maxFreq=count[str.charAt(i)];
				ans=str.charAt(i);
			}
			
		}
		return ans;
		
		
		
}
}
