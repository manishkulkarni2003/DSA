package OOPS.Practice;

class engine {
	void display() {
		System.out.println("This is an engine");
	}
}
class car extends engine{
	void display() {
		System.out.println("This is a car");
	}
	
}
class brake extends car{
	void brakes() {
		System.out.println("mutlilevel Inheritance");
	}
}
class acc extends car{
	void hierarchi() {
		System.out.println("Hierarchical Inheritance");
	}
}
public class inheritance {
	//java has Inheritance Concepts
	//single inheritance
	//MultiLevel
	//Hierarchical
	//mutltiple
	//Hybrid
}
