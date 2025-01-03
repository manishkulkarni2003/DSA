package OOPS.Access;

public class AccessModifier {
	
	private int num;
	protected String name;
	 int[] arr;
	
	
	//We can access the Num Private Varaible using the Getters and Setters
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num =num;
	}
	
	
	public AccessModifier(int num, String name) {
		
		this.num = num;
		this.name = name;
		this.arr = new int[34];
	}
	
	
}
