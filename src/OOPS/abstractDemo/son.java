package OOPS.abstractDemo;

public class son extends abstractExample {
//abstract classes Needs to be Extended
	public son(int age) {
		super(age);
		
	}
	//this is are Abstract Methods Implemented in the sub Class
	
	@Override
	void career(String name) {
		// TODO Auto-generated method stub
		System.out.println("Your Career Is in Your hands"+name);
	}

	@Override
	void shirt(String name) {
		// TODO Auto-generated method stub
		System.out.println("Choose Your Shirt"+name);
	}

	@Override
	void normal() {
		// TODO Auto-generated method stub
//		super.normal();
		System.out.println("The Normal method Has been Overriden ");
	}
	
	
	
}
