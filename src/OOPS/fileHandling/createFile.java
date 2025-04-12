package OOPS.fileHandling;
import java.io.File;
import java.io.IOException;

public class createFile  {
	public static void main(String[] args) {
	
		try {
			File myObj =new File("input.txt");
			if(myObj.createNewFile()) {
				System.out.println("File Created Successfully"+myObj.getName());
			}
			else {
				System.out.println("File Already Exist");
			}
			
		}catch(IOException e) {
			
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	
	
	
	}
}
