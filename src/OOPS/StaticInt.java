package OOPS;
//this is a demo to Show Initialisation of Static Variables
public class StaticInt {
	//Only Inner Classes Can be Static
	
	//this Class Doesnt Depend on StaticInt Class 
	 static class Test{
		String name;
		
		public Test(String name) {
			this.name=name;
		}

		@Override
		public String toString() {
			return name;
		}
	}
	
	static int a=4;
	static int b;//Not depended On Objects
	
	//will Only run Once When the first Object is Create i.e when the class is Loaded For First time
	static {
		System.out.println("Iam In a Static Block");
		b=a*5;
	}
	public static void main(String[] args) {
	StaticInt obj =new StaticInt();
	System.out.println(StaticInt.a+" "+StaticInt.b);
	
	StaticInt.b+=3;
	
	
	System.out.println(StaticInt.a+" "+StaticInt.b);
	
	//if we Dont Use Static We Get Error
	Test a=new Test("Manish");
	System.out.println(a.name);
	Test b =new Test("Janya");
	System.out.println(b.name);
	
	//No enclosing instance of type StaticInt is accessible. Must qualify the allocation with an enclosing instance of type StaticInt (e.g. x.new A() where x is an instance of StaticInt).
	}
}
