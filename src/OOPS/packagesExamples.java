package OOPS;//it is the path of the folder
//Package is Just A folder
//OOps is Just a Folder 
public class packagesExamples {
	//Why is Main declared As Static Because We Can use the main Method
	//Without Creating the Object
	public static void main(String[] args) {
	
		B Obj =new B("Manish",51);
		System.out.println(Obj);//prints Address Of Obj 
	
		
		Humans manish =new Humans(22,"Manish",100000,false);
		System.out.println(manish.name);
		
		
		Humans Janya =new Humans(10,"Janardhan",1000000,false);
		Humans user =new Humans(10,"User",1000000,false);
		System.out.println(Janya.population);
		System.out.println(manish.population);
		System.out.println(Humans.population);
		
		
	}
	//What is Static?
	//When a member is declared static, it can be accessed before any objects of its class are created,
//	and without reference to any object. You can declare both methods and variables to be static.
	public static void message() {
		System.out.println("Hello Packages");
	}
	
}

class B{
	String name;
	int rollno;
	B(){
		
	}
	B(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		
	}
}