package dsa.interviewPrep;

import java.util.Stack;

public class NestedStrings {
	public static void main(String[] args) {
		
		String str="2[a3[b]]";
		System.out.println(DecodeString(str));
		
		
		
	}
	static String DecodeString(String Str) {
		Stack<StringBuilder> strStack =new Stack<>();
		Stack<Integer> numStack=new Stack<>();
		
		StringBuilder currentString =new StringBuilder();
		int num=0;
		
		for(char c:Str.toCharArray()) {
			if(Character.isDigit(c)) {
				//We use this Line here (c-'0')to Convert String to Integer
//				Convert Character to Numeric Value
//				Characters like '0', '1', '2', ..., '9' are stored as ASCII (or Unicode) values in computers. For example:
//				'0' has an ASCII value of 48.
//				'1' has an ASCII value of 49.
//				'2' has an ASCII value of 50, and so on.
//				Subtracting '0' (which has the value 48) from any digit character gives the corresponding numeric value:
//				'3' - '0' = 51 - 48 = 3
//				'7' - '0' = 55 - 48 = 7
				num =num*10+(c-'0');
			}else if(c=='[') {
				numStack.push(num);
				strStack.push(currentString);
				currentString=new StringBuilder();
				num=0;
			}else if(c==']') {
				int repeatCount=numStack.pop();
				StringBuilder temp=strStack.pop();
				for(int i=0;i<repeatCount;i++) {
					temp.append(currentString);
				}
				currentString=temp;
			}else {
				currentString.append(c);
			}
		}
		
		return currentString.toString();
		
		
		
	}
}
