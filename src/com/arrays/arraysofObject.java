package com.arrays;

public class arraysofObject {
	
	public String name;
	int age;//insatance variables
	public arraysofObject(String name,int age) {
		this.name=name;//referes to the instance variables
		this.age=age;
	}
	//we can store objects in arrays also
	public static void main(String[] args) {
		
		arraysofObject[] arr=new arraysofObject[2];
		
		arr[0]=new arraysofObject("manish",22);
		arr[1]=new arraysofObject("janardhan",10);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].age);
			System.out.println(arr[i].name);
		}
		
	
	
	}
}
