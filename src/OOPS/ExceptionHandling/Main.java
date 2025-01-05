package OOPS.ExceptionHandling;

public class Main {
	public static void main(String[] args) {
	
	int a =6;
	int b=1;
		
	try {
		int c=divide(a,b);
		System.out.println("The Division of a and b is:"+c);
		String name ="Manish";
		if(name.equals("Manish")) {
			throw new MyException("Name is Manish"+name);
		}
	}catch(ArithmeticException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println("Normal Exception"+e.getMessage());
	}
	//optinal
	finally {
		System.out.println("This is Will Always Executes");
	}
	
	
	
	
	}
	//throws is used to Declare Exception 
	//Warning the Method to handle the Exception
	static int divide(int a,int b) throws ArithmeticException {
		//Explicitly Throw and Exceptions
		
		//throw Keyword Throws the Exception
		if(b==0) {
			throw new ArithmeticException("Please Donot Divide by Zero");
			
		}
		return a/b;
	}
}
