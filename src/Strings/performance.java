package Strings;

public class performance {
	public static void main(String[] args) {
	String series ="";
	for(int i =0;i<26;i++) {
		char ch = (char)('a'+i);
		
		series =series+ch;
		//new String object is created and
		//copying the entire string and again 
		//it continues memory is wasted 
	}
	System.out.println(series);
	//O(nsquare) -->time complexity
	//size =1+2+3+4....+26
	}
}
