package OOPS.fileHandling;
import java.io.*;
import java.util.*;
public class Swaplines {
	public static void main(String[] args)throws IOException{
		List<String>lines=new ArrayList<>();
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line;
		while((line=br.readLine())!=null) {
			lines.add(line);
		}
		br.close();
		
		//Swapping Logic
		for(int i=0;i<lines.size()-1;i+=2) {
			String temp=lines.get(i);
			lines.set(i, lines.get(i+1));
			lines.set(i+1, temp);
			
		}
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
		for(String l:lines) {
			bw.write(l);
			bw.newLine();
		}
		bw.close();
	}
}
