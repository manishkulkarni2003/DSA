package OOPS;

//Importing the PAckages
import static OOPS.packagesExamples.message;
public class IntroToClass {
	
	public static void main(String[] args) {
		
		Student manish =new Student();
//		manish.rno=51;
		manish.names="Manish Kulkarni";
		
		System.out.println("The roll no of Manish is :"+manish.rno);
		
		Student Rahul = manish;
		Rahul.rno=33;
		System.out.println("The roll No of rahul is :"+Rahul.rno);
		message();
		}
	//Class is a Named Group of Properties and Function
	//or A template of Objects
	//A class is a template for an object, and an object is an instance of a class.
}
	class Student{
		//instance variable
		//for every Student
		int rno=20;//default Value
		String names=null;
		float marks;
	}

