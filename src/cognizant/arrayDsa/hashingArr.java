package cognizant.arrayDsa;

import java.util.Scanner;
//Time Complexity Decreases  O(n)
public class hashingArr {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Arr");
		int n=sc.nextInt();
		//Created an Array using user input
		int[] arr=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();//elements in arr from user
		}
		int[] hash=new int[13];
		//Created Our hash Table
		for(int i=0;i<n;i++) {
			hash[arr[i]]+=1;//increases the Freq
		}
		
		System.out.println("Enter the Queries You Want to Search: ");
		
		int q=sc.nextInt();
		
		System.out.println("Enter the Number for which You Want to Find the Freq");
		
		while(q-->0) {
			int number =sc.nextInt();
			System.out.println("Frequency of the Number:"+number+"is:"+hash[number]);
		}
		
		
		
	}
	
}
