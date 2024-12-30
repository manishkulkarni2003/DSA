package OOPS;

public class typesOfInheritance {

	//there are 4 types of Inheritance 
	
	//1.Single Inheritance ->One class Inherits Another class
	//Like Child class Inherits The Parent Class
	
	//2.MutliLevel Inheritance
	//So The Derived Class of the Base Class Will be the Base Class of the Next Child Class
	//Box(base Class)->     BoxWeight(Child Class)   ->BoxPrice(child Class of the Derived Class)
	//Demo of This 
	public static void main(String[] args) {
	
	human obj =new human("Manish",22,60);
	System.out.println(obj.name);
	
	men obj2=new men("Janardhan",22,60,"Male");
	System.out.println(obj2.Gender);
	
	child obj3 =new child("Manish",22,60,"Male","Smsk");
	System.out.println(obj3.School);
	System.out.println(obj3.str);
	//Yes the Mutliple Inheritance Works fine Here Can Access All the Property of the Above Classes 
	
	
	//3.Multiple Inheritance java By Default Doesnt Support Multiple of Inheritance
	//We Might Use the Interfaces To implement this and Why dont we have Multiple Inheritance 
	//Because of Conflict of Properties
	
	//4.Hierarchical Inheritance 
	//Here the Base Class is Derived by the multiple Child Classes
	//Like Humans Can be Extended For Men also For child Also for any other class for that instance
	
	
	//5.Hybrid Inheritance 
	//It is the Combination of Single and Multiple Inheritance
	//But Java Doesnt Support Multiple Inheritance So we Need to Use interfaces for this 
	
	}
	
	
}

class human{
	String name;
	int age;
	int weight;
	String str ="This is in the Base Class Lets See Can the GrandChild Class Can Access this or not";
	human(){
		
	}
	//constructor Overloading 
	human(String name,int age,int weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
		System.out.println("This is The Base Class");
		
	}
}

class men extends human{
	String Gender;
	men(){
		
	}
	men(String name,int age,int weight,String Gender){
		super(name,age,weight);
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.Gender=Gender;
		System.out.println("This is the Derived Class of the Base Class");
		
	}
}

class child extends men{
	String School;
	
	child(){
		
	}
	//Constructor overLoading-->Same Name But Different Parameters
	child(String name,int age,int weight,String Gender,String School){
		super(name,age,weight,Gender);
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.Gender=Gender;
		this.School=School;
		System.out.println("This Class is Dervied From the Dervied Class of Base Class");
	}
	
}
//for hierarchical Inheritance
class SibilingChild extends men{
	//Alright So Men can Be Extended By Child and its Sibiling class
	//Also Can Access all the Properties of Men
	SibilingChild(String name,int age,int weight,String Gender){
		super(name,age,weight,Gender);
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.Gender=Gender;
		
		System.out.println("This is Extended By the Men Class ");
	}
	
}
