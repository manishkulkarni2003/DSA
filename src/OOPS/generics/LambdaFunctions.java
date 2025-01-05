package OOPS.generics;

import java.util.ArrayList;
import java.util.stream.Collectors;
public class LambdaFunctions {
	
	public static void main(String[] args) {
	ArrayList<Integer> arr= new ArrayList<Integer>();
	for(int i=0;i<5;i++) {
		arr.add(i+1);
	}
	arr.forEach((item)->{
		System.out.println(item*2);
	});
	
	ArrayList<Integer> filtered=(ArrayList<Integer>) arr.stream().filter((n)->n%2==0).collect(Collectors.toList());
	
	System.out.println(filtered);
	
	Operation sum =(int a,int b)->System.out.println("The Sum is"+(a+b));
	
	sum.sum(1, 2);
	
	
	
	}
//	static int sum(int a,int b) {
//		return a+b;
//	}
	

	
}
interface Operation{
	void sum(int a ,int b);
}
