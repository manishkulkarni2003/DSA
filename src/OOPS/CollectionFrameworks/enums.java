package OOPS.CollectionFrameworks;

public class enums {
	//it is Like A Datatype
	//Enums Can Implements As Many InterfAces It can but Cnnot Extend class or Cannot be Super Class 
	enum Week{
		Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
		//these are enum constants
		//public,static and final By default
		//Since Its Final You Cannot Create Child Enums
		Week(){
			System.out.println("Constructor Called for "+this.toString());
		//This is Not Public or Protected only Private or Default
			//we Dont to Create New Objects 
		//Because This is Not the Enum Concept 
			
		}
	}
	public static void main(String[] args) {
	
	Week week;
	week=Week.Monday;
	System.out.println(week);
	
	
//	for(Week day:Week.values()) {
//		System.out.println(day);
//	}
	
	
	}
}
