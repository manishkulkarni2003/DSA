package Strings;

public class StringBuilderDemo {
//Strings are immutable but the tc is O(n2)
	//need a datatype that can be mutable 
	//not adding the objects 
	
	//the solution to this String BUilder 
	//only one object is created and modification
	//are made to the one object only
	public static void main(String[] args) {
	
	StringBuilder builder =new StringBuilder();
	
	for(int i=0;i<26;i++) {
		char ch=(char)('a'+i);
		builder.append(ch);
	}
	System.out.println(builder);
	//its not creating new object 
	//it is mutable
	builder.deleteCharAt(0);
	builder.reverse();
	System.out.println(builder);
	
	
	
	}
}