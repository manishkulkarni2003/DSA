package OOPS;


//What is Polymorphism Poly Means Many and Morphism Means ways to Represent

public class polymorphism {
	
	public static void main(String[] args) {
		//Clearly We Can See that The Area Function is Different for
		//Every Object Because Area of Every Specific Shapes is Different
		//This is What Polymorphism is About Same Name But Different Way to Implement
		//Act of representing of Same thing in Multiple Ways 
		//We Have Two Types of Polymorphism
		
		//1.Compile time Polymorphism/Static Polymorphism
		//This is Achieved Via Method Overloading
		//Class Where it has Multiple Methods With Same name But Different Parameters
		//Same Name But different datatype arguments or return type ordering can be Different 
		
		//2.Run-time Polymorphism/Dynamic Polymorphism
		//This is Achieved Via Method Overriding
		//When a Child Class As the Method  And Also Parameters Return type etcc..
		//But in different body Means Different Class The Same As the Super Class or parent Class
		//That is Know as Overriding 
		
		
		Circle obj =new Circle(4);
		obj.area();
		//@Overloading
		obj.display("Manish");//So here Same Name of Method But Different Type of Way to represent 
		
		Square obj2 =new Square(6);
		obj2.area();
		obj2.display(22);//Here Different DataType
		
		Triangle obj3 =new Triangle(4,6);//Here We Already Created Constructor Overloading
		obj3.area();
		obj3.display("Hyderabad");//Same Datatype But Different order 
	
		Numbers obj4=new Numbers();
		int a=obj4.sum(4.55,5);//So the Java Compiler Understands Which Method to Call
		int b=obj4.sum(4, 5,6);
		System.out.println("Sum of First Method is :"+a);
		System.out.println("Sum of Second Method is :"+b);
		
		//type is Parent class and The Object is Child class Then we Know the Actual use of overriding
		//Like
		Shapes obj5=new Circle(4);
		obj5.area();//This is Overridden Method from the Shapes
		//But How Does Java Know which One to Run
		//Java Determines By Dynamic Method Dispatch
		//Java Will determine While Run time Which Method to Run
		//So While Run time Java Determines Which One to Call by the Type of the Object 
		//rather than Type of the Reference Class
		//Circle Area Has Different method the Overridden One
		
		Numbers.greeting();
		//overriding depends on Object and Static Method Doesnt Depend on Object So thats why the Static Methods Cannot be Overridden 
	}
}
//Encapsulation 
//Mean Wrapping Up the Implementation of Data Members and methods in a class
//Hidding the Data

//Abstarction 
//Hidding the Unnecssary Details And Showing Valuable Information 





//another Example 
class Numbers{
	public int sum(double a ,int b) {
		return (int)a+b;
	}
	//see No error For this 
	public int sum(int a ,int b,int c) {
		return a+b+c;
	}
	static void greeting() {
		System.out.println("Hello Good Morning");
	}
}
//We Can Also Use the Final Keyword for Preventing the Method Overriding
class Shapes{
//	final void area() Cannot Override The Method Which has Final Keyword So Basically Fucked the Overriding Principle of All the Child Classes
	 //Early Binding This is Called
	//This Is Late Binding
	//final Keyword Also Used to Stop inheritance
	void area() {
		System.out.println("Iam in Shapes");
	}
}
class Circle extends Shapes{
	double pie =3.14;
	int r;
	
	Circle(int r){
		
		this.r=r;
		
	}
	//this is Overriding 
	@Override //Used for Check Purposes
	void area() {
		System.out.println("Iam Circle Area of Circle is:"+pie*r*r);
	}
	void display(String name) {
		System.out.println("Hello :"+name);
	}
	

}

class Square extends Shapes{
	int a ;
	Square(int a){
		this.a=a;
	}
	@Override  //Why do we use this ? This Is Called Annotation 
	//we Use This If We want to check if the Method is Overridien or Not?
	void area() {
		System.out.println("The Area of Square is:"+a*a);
	}
	//example?
//	@Override //this is Giving me Area of Cretaing the Method in Super class or Remove Annotation Basically checking if the Method is Overridden or not
	void areaa() {
		System.out.println("This is Used to Show Override Annotation");
	}
	void display(int age) {
		System.out.println("Your Age is: "+age);
	}
}
class Triangle extends Shapes{
	int base;
	int height;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	void area() {
		System.out.println("The Area of triangle is :"+0.5*base*height);
	}
	void display(String Address) {
		System.out.println("Hey Your Address is "+Address);
	}
}


