package OOPS.fileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readfile {
	 public static void main(String[] args) {
		 
		 try {
			 
			 File myObj =new File("manish.txt");
			 Scanner myReader=new Scanner(myObj);
			 while(myReader.hasNextLine()) {
				 String data =myReader.nextLine();
				 System.out.println(data);
			 }
			 myReader.close();
			 
			 
		 }catch(FileNotFoundException e) {
			 System.out.println(e.getMessage());
			 e.printStackTrace();
		 }
	 
	 
	 }
}
