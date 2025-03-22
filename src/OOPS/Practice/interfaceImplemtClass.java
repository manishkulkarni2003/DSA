package OOPS.Practice;

class engineImplements implements engineDemo{
	public void brakes() {
		System.out.println("Brakes are Applied");
	}

	@Override
	public void accelator() {
		System.out.println("Accelaration");
		
	}

	@Override
	public void clucth() {
		// TODO Auto-generated method stub
		System.out.println("Clucth Applied");
	}
	 
}

public class interfaceImplemtClass {
	public static void main(String[] args) {
		//interface name obj =new class name
		engineDemo obj=new engineImplements();
		obj.brakes();
	
	}
	
	
}
