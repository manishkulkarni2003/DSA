package cognizant.Pyq;

import java.util.Scanner;

public class pyq {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Placement of cse");
		int cse =sc.nextInt();
		System.out.println("Enter the Placement of ece");
		int ece=sc.nextInt();
		System.out.println("Enter the Placement of mech");
		int mech=sc.nextInt();
		
		if(cse<0||ece<0||mech<0) {
			System.out.println("Invalid Output");
		}
		
		if(cse>ece &&cse>mech) {
			System.out.println("Cse Has the Highest Number of Placements"+cse);
		}else if(ece>cse &&ece>mech) {
			System.out.println("Ece Has the Highest Number of Placement"+ece);
		}else {
			System.out.println("Mech Has the Highest Number of Placements"+mech);
		}
		//So Many edge Cases of If Else is Required to Do it

	
	
	}
	
}
