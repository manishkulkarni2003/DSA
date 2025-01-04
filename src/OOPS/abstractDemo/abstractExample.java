package OOPS.abstractDemo;

public abstract class abstractExample {
	//Cannot Create Abstract Constructors
	//Cannot Create Abstract static methods
	
	//Atleast one of the method needs to be Abstract so that Class Needs to be Abstarct
	
	//Still Abstract Classes Doesnt Support multiple inheritances
	
	
	int age;
	
	public abstractExample(int age) {
		
		this.age = age;
	}
	//We cannot Even Create abstract Static Methods in the Abstract Class
	//Cause Static Methods Cannot be Overriddden
	
	
	//we Can Create Static Methods 
	
	static void hello() {
		System.out.println("Hello");
	}
	
	
	void normal() {
		System.out.println("This is A Void Method");
	}
	
	
//	abstract abstractExample(); Cannot Create Abstract Constructor

	//Abstract Methods just Signature no body
	//An abstract method in object-oriented programming is a method that is declared without an implementation (i.e., it has no body). Instead, the implementation of the method is deferred to the subclasses that inherit from the class containing the abstract method.
	abstract void career(String name); 

	abstract void shirt(String name);

}
