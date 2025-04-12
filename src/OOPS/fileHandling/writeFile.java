package OOPS.fileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class writeFile {

	public static void main(String[] args) {
		try {
			FileWriter myObj=new FileWriter("input.txt");
			myObj.write("Hello This is Written Using write Method of FileWrite Class");
			myObj.write("This is the Second Line in the File");
			myObj.close();
			System.out.println("file Written Successfully");
			
		}catch(IOException e) {
			System.out.println("An Error Occured"+e.getMessage());
			e.printStackTrace();
			
		}
		
		
	}
}
