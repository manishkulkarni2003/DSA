package OOPS.fileHandling;
import java.io.File;
import java.io.FileNotFoundException;
public class deleteFile {
	
	public static void main(String[] args) throws FileNotFoundException {
	
File myObj =new File("manish.txt");
		if(myObj.delete()) {
			System.out.println("file Deleted Successfuly"+myObj.getName());
		}
	
	}
}
