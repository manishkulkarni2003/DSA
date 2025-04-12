package OOPS.fileHandling;


import java.util.*;
import java.io.*;
public class fileStats {
	public static void main(String[] args)throws IOException{
		BufferedReader reader =new BufferedReader(new FileReader("input.txt"));
		int lines=0;
		int words=0;
		int chars=0;
		String line;
		while((line=reader.readLine())!=null) {
			lines++;
			words+=line.split("\\s+").length;
			chars+=line.length();
		}
		reader.close();
		System.out.println("No of Lines is:"+lines);
		System.out.println("No of Words is :"+words);
		System.out.println("No of chars is:"+chars);
	}
}
