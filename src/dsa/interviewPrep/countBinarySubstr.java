package dsa.interviewPrep;

public class countBinarySubstr {
	public static void main(String[] args) {
		
		String str="00110011";
		System.out.println(CountBinarySubStrings(str));
		
	}
	
	//F*** its not Right
	public static int CountBinarySubStrings(String str) {
		if (str == null || str.length() < 2) {
            return 0; // No substrings possible
        }
		
		
		int totalCount=0;
		for(int i =0;i<str.length();i++) {
			int count0 =0;
			int count1=0;
			for(int j=i;j<str.length();j++) {
				if(str.charAt(j)=='0') {
					count0++;
				}
				else {
					count1++;
				}
				if(count0==count1) {
					totalCount++;
				}
			}
		}
		return totalCount;
		
		
		
	}
	
	
	
	
	
}
