package cognizant.arrayDsa;

import java.util.HashMap;
import java.util.Scanner;

public class hashingUsingHashMap {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Size of the Arr");
		int n=sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter the Elements in the Array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//collection framework of hashmap no need to har code hashmap
		HashMap<Integer,Integer>hm =new HashMap<>();
		
		for(int i=0;i<n;i++) {
			int key=arr[i];
			int freq=0;
			if(hm.containsKey(key)) {//check is the key is present in 
				freq=hm.get(key);//hashmap if true returns freq
			}
			
			freq++;//if no freq is present it means the element is reached first
			hm.put(key, freq);//updating the hashmap with key and freq
		}
		
		System.out.println("Enter the Number of Queries: ");
		
		int q=sc.nextInt();
		System.out.println("Enter the Number to Check the Freq of ?");
		while(q-->0) {
			int number =sc.nextInt();
			if(hm.containsKey(number)) {
				System.out.println("The Freq of the Num:"+number+"is:"+hm.get(number));
			}else {
				System.out.println(0);
			}
		}
		
		
	}
}
