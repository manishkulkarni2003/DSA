package OOPS.Practice;

//a Class is a real world entity
//Class is a Blueprint of From which the Objects are Created
//class consists of variables fields methods etcc
class Student{
	int age;
	String name;
	int Id;
	//Constructor is a Special method
	Student(){
		System.out.println("This is A Default Constructor");
		System.out.println("Constructors are used to Intialize the Instance Varibles");
	}
	//This is a Parameterized Constructor
	Student(int age,String name,int id){
		this.age=age;//we use this keyword to Refer the instance Varaibels
		this.name=name;
		this.Id=id;
		
	}
	//Methods in Java 
	//2 types user defined Method and Inbuilt Methods
	//Like print,Scanner etc Are inbuilt
	//But we can Also Create Our own method
	void display() {
		System.out.println("This is a user defined Method");
	}
	
	
	
}

public class ClassAndObjects {
	public static void main(String[] args) {
	//Object is an Instance of A class
	//Object has State behaviour
		//bascically it implements the functionality of the class
	//syntax of creating a Obj
		Student obj=new Student(22,"Manish",51);
		System.out.println(obj.name);
		//new keyword Allocates the Memory at run time
		obj.display();
	}
}
