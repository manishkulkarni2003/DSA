package dsa.interviewPrep;


import java.util.ArrayList;

/*
 * char*MoveHyphen(char str[],int n);
The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). 
Implement the function to move all hyphens(-) in the string to the front of the given string.
NOTE:- Return null if str is null.
Example :-
* Input:
o str.Move-Hyphens-to-Front
* Output:
o —MoveHyphenstoFront
Explanation:-
The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the 
string, this output is “— MoveHyphen”
Sample Input
* Str: String-Compare
Sample Output-
* -StringCompare*/
public class moveHyphen {
	
	public static void main(String[] args) {
		
		String str ="Stew-Haary";
		System.out.println(moveHyphentoFront(str));
		
		
	}
	
	
	public static String moveHyphentoFront(String str) {
		
	String res ="";
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='-') {
			res=str.charAt(i)+res;
		}else {
			res=res+str.charAt(i);
		}
	}
	return res;
	
}
}
