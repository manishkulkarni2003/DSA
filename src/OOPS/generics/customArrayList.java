package OOPS.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {
	
	private int[] data ;
	private static int DEFAULT_SIZE=10;
	private int size=0;//also working as index Value
	
	
	
	
	public customArrayList() {
		this.data =new int[DEFAULT_SIZE];
		
	}
	
	public void add(int num) {
		if(isFull()) {
			resize();
		}
		data[size++]=num;
		
	}

private void resize() {
		// TODO Auto-generated method stub
		int[] temp=new int[data.length*2];
		
		//copy the Current items in the new array
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data=temp;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return size ==data.length;
	}
	
	public int remove() {
		int removed=data[--size];
		return removed;
	}
	public int get(int index) {
		return data[index];
	}
	public int size() {
		return size;
	}
	public void set(int index,int value) {
		data[index]=value;
	}
	
	
	
	@Override
	public String toString() {
		return "customArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

	public static void main(String[] args) {
	
//		ArrayList list =new ArrayList();
		//Problem with Custom Array list is That we can 
		//only store integer where as IN Actual ArrayList
		//we can Also Store string char custom datatypes
		customArrayList list =new customArrayList();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(13);
		list.add(15);
		list.add(18);
		list.add(21);
		list.add(24);
		list.add(27);


		System.out.println(list);
		//Here this is Called Generics		list.add(5);
		//<Integer> this is Generics
		//help us providing a parametarized type of the Class of Arraylist Etcc..
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<String> list3=new ArrayList<String>();
		//we use generics for type safety
		//we can only add classes in generics not primitives
	
	}
}
