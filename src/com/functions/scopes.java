package com.functions;

public class scopes {
	public static void main(String[] args) {
	int a =10;
	int b =20;
	
	{	//anything which is initialised the block can be used inside the block 
		//but things which are initialised inside the block cannot be accessed outside the block
		int c=23;
		
		//values initialised in this block will remain in this block only
	System.out.println(c); //now it will work
	};
	//loop scope 
	for(int i =0;i<=5;i++) {
		System.out.println(i);
		int num=90;
	}
//	System.out.println(i); throws error 
	
//	System.out.println(c);-->cannot use outside the block
}
	public static void swap(int a ,int b) {
		int temp=a;
		a=b;
		b=temp;
		//block scoped
		
	}
}
