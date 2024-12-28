package OOPS;


//constructor -->Once defined, the constructor is automatically called when the object is created, before the new operator completes.
//Constructors look a little strange because they have no return type, not even void.
//This is because the implicit return type of a class’ constructor is the class type itself.

public class constructor {
	 
	
public static void main(String[] args) {
		
		Student2 manish =new Student2(51,"Manish Kulkarni",99.9f,99.f);
		
		
		manish.greeting();
		System.out.println(manish.avg());
		
		Student2 janya=new Student2();
		
		//default construtor Ko call kar rha hai 
		
//		System.out.println(janya.rno=22);
//		System.out.println(janya.name="Janardhan Kulakrni");
//
//		System.out.println(janya.marks=100);
//		System.out.println(janya.marks2=99.5f);
		System.out.println(janya.name);
		Student2 janya1 =new Student2(21,"Janya",100,100);
		System.out.println(janya1.toString());


		//In java Objects are stored in heap memory
		//where as primitive data types are not object 
		//so they are stored in the stack memory
//		Yes, in Java, an array is an object.
//		Here's why:
//		Inheritance:
//		Arrays inherit from the Object class, which means they have access to all the methods defined in the Object class, like toString(), equals(), and hashCode().
//		Dynamic Allocation:
//		Arrays are dynamically created at runtime using the new keyword, just like other objects.
//		Reference Type:
//		Arrays are reference types, meaning the variable that holds an array stores a reference to the actual array object in memory.
//		Class:
//		Each array type has a corresponding class, e.g., int[] has the class [I. You can check this using array.getClass().getName().
//also Array is non primitive 
		
		Student2 one =new Student2();
		Student2 two =one;
		one.name ="Something";
		System.out.println(two.name);
		
}
}

class Student2{
	int rno;
	String name;
	float marks;
	float marks2;
	
	Student2(){
//		this.rno=0;
//		this.name=null;
//		this.marks=0;
//		this.marks2=0;
//this is how u call an another constructor 
		this(13,"manish",99,99);

	}
	
	
//	@ConstructorOverloading
	Student2(int rno,String name,float marks,float marks2){ //This is an Constructor
		//this is a special function that Creates and Objects 
	//we need a way to add the values 
//of the above properties object by object
		
	this.rno=rno;
	this.name=name;
	this.marks=marks;
	this.marks2=marks2;
	}
	
	void greeting() {
		
		System.out.println("Good Morning"+this.name+" ");
	}
	float avg() {
		 
		 return  this.marks+this.marks2;
		 
	}
	
	
}


