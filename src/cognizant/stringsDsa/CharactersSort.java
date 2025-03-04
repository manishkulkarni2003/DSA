package cognizant.stringsDsa;

import java.util.Arrays;

public class CharactersSort {
	public static void main(String[] args) {
		String ans="cgqob";
		System.out.println(sortOptimal(ans));
		
		
	}
	public static String sort(String str) {
		
		char[] charArr=str.toCharArray();
		
		//apply bubble sort to this
		
		for(int i=0;i<charArr.length-1;i++) {
			for(int j=0;j<charArr.length-i-1;j++) {
				if(charArr[j]>charArr[j+1]) {
					char temp=charArr[j];
					charArr[j]=charArr[j+1];
					charArr[j+1]=temp;
					
				}
			}
		}
		String ans=new String(charArr);
		return ans;
		
	}
	//optimal Solution 
	public static String sortOptimal(String str) {
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		
		String ans=new String(arr);
		return ans;
	}
}
