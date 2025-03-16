package OOPS.Practice;

class Human{
	String name;
	int age;
	Human(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class Arrays {
	//Arrays is a Non-Primitive Data Type 
	//Also Data Structure 
	//Arrays is Collection of Similar elements or 
	//homogeneous element in a Contiguous Memory Location
	
	//there are two Types of Arrays 
	//One dimensional Arrays 
	//and Multi Dinmensional Arrays
	public static void main(String[] args) {
	int [] arr= new int[5];
	arr[0]=2;
	arr[1]=4;
	arr[3]=5;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	Human[] arr1=new Human[3];
	
	arr1[0]=new Human("manish",22);
	arr1[1]=new Human("janya",10);
	arr1[2]=new Human("Human",99);
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i].name);
	}
	int[][] arr3= {{2,3},{1,2},{4,5}};
	for(int i=0;i<arr3.length;i++) {
		for(int j=0;j<arr3.length-1;j++) {
			System.out.println(arr3[i][j]+" ");
		}
	}
	
	}
	//arrays of Object
	//we can Create array of Object
	
	//multi dimensional Arr
	
	//jaggard array is Where each row has Different no of Colunms
}
