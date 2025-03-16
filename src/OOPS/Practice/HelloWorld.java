package OOPS.Practice;
	

class something{
	String name;//This are Instance Variable
	int age;
	//Constructor is a special type of method Which has No Return type
	//it initializes the instance Variables
	//constructor is Called When the Object is Created 
	something(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		String name="Manish";//this is a Local Variable
		System.out.println("Hello Im Outside the Class");
}
}
//Hello World Here it is a Identifier
public class HelloWorld {
	//Anything Nmaing class Variable Method is A Identifier
	//Java is A Statically Typed Language 
	//Mean we have ton explicity Declare the Type of the Varaible
	
		
	
	public static void main(String[] args) {
		String name="Manish";
		System.out.println(name);
		something obj=new something("Manish",22);
		obj.display();
		var name1="Manishvar";
		System.out.println(name1);
	}
	
	//we have 2 types of Data Type
//	Primitive and Non Primitive
//	Primitive consists->int,float,double,char,boolean
	//non Primitive are Arrays and String
	
}
