package OOPS;

public class StaticExamples {
	public static void main(String[] args) {
	
	//only if we change The Method to Static We Can Access it 
		//we Cannot Access Non Static Methods 
		//In the Static Class
		
		
		//This is How we Can Access the Non Static Methods in Sttaic Main 
		StaticExamples greet =new StaticExamples();
		greet.greeting();
		//we have to Create An Instance
		
		//we know That Something which is Not Static Belongs to an Object
		
	}
	 void greeting() {
		System.out.println("Good Morning");
	}
	 //we Cannot Use this keyword in static functionns 
	 public static void fun() {
		 StaticExamples funn=new StaticExamples();//You cant use This Because It requires 
		 funn.greeting();
		 //an instance 
		 //but the function you are using it in does not depend on instances
	 }
	 //but we can access static and non sttaic methods in a non sttaic class and method
	 void lmao() {
		 greeting();
		 fun();
	 }
}

class Humans{
	int age;
	String name;
	int salary;
	boolean married;
	static long population;
	
	
	public Humans(int age, String name, int salary, boolean married) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		//with humans Class Warning is removed 
		//Where as If we use this we get Warning
		Humans.population+=1;
	}
	
	
}
