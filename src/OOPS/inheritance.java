package OOPS;

//What is Inheritance?
//In Real life How Our Parents Property is Passed to Children Ex(Money,Land,Human Traits,Values Etcc..)
//Children Can Use those Things 
//Base Class(Length,width) -->Child Class(Can Also Access the Property Length,Width) Also Its Own Method Like Weight
//Child Class is Inheriting The Property From Base Class
//A Class Can Inherit The Property of the Base Class By the Keyword extends 
public class inheritance {
	public static void main(String[] args) {
		box obj =new box(10,10);
		obj.print();
		threeDbox obj2 =new threeDbox(10,10,10);
		
		obj2.print();
		
		//Generally the Parent Class Cannot Access the Properties of Child class But What If We do this?
//This is reference Type  this is object 
		box obj3 =        new threeDbox(10,10,10);
		System.out.println(obj3.width);//Here We Can Access the Width But not the Weight
//		System.out.println(obj3.volume); Cannot Access the Volume Property of Box Class
		//The Type of the Reference That Determines What Property or class is called not he Object
	}
//	The super keyword in Java is used to refer to the immediate parent class. It can be used in the following ways:
//
//		To call the parent class's constructor.
//		To call a method of the parent class that has been overridden in the child class.
//		To access parent class properties if they are shadowed in the child class.
	
	
}
//Imagine this has the Base Class 
class box{
	 int length;
	 int width;
//	 int volume;
	box(int length,int width){
//		super();
		this.length=length;
		this.width=width;
	}
	public void print() {
		System.out.println("The Length of This Class is "+length+"and the Width is "+width+" ");
	}
	
}
//This Can be Called As Child Class
class threeDbox extends box{
	int volume =20;
	
	threeDbox(int length,int width,int volume){
		//This is Calling its Immediate Parent Class
		super(length,width);//Here We Can Access the Length Because Super is Calling the PArent Class constructor So that Mean the Parent Class is initializing the Values of Length And Width 
		//Used to Call Immediate Parent Class Constructor here 
		//Used to Initialize the Values Present in Parent Class 
		this.volume=volume;
		this.width=width;
//		System.out.println(super.volume); //So we Can Also Explicitly Access the Property Here 
		//		this.length=length; Cant Access this Because it is Private 
	}
	@Override
	public void print() {
		super.print();
		System.out.println("The Length of This Class is "+length+"And the width is "+width+"And the Volume is "+volume);
	}
}
