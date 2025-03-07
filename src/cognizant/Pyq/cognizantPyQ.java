package cognizant.Pyq;

import java.util.Scanner;

//Pizza Puff and coldDrink
public class cognizantPyQ {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No of Pizza:");
	int pizza =sc.nextInt();
	System.out.println("Enter the No of Puffs");
	int puffs=sc.nextInt();
	System.out.println("enter the No of ColdDrinks");
	int coldDrinks=sc.nextInt();
	
	System.out.println("Bill Details");
	
	System.out.println("the no of Pizza:"+pizza);
	System.out.println("the no of puffs:"+puffs);
	System.out.println("The no of ColdDrinks"+coldDrinks);
	int total =(pizza*100)+(puffs*20)+(coldDrinks*10);
	System.out.println("Total Price is "+total);
	
	
	}
}
