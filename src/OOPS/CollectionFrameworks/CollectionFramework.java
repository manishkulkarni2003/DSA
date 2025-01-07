package OOPS.CollectionFrameworks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionFramework {
	public static void main(String[] args) {
	
	//Array List is the Class Implementing the List
	List<Integer> list =new ArrayList<>(Arrays.asList(1,2,34,5,6));
	List<Integer> list2 =new LinkedList<>();
	
	//In ArrayList Multiple threads Can Access the Same Objects
	//ArrayList is Not Synchronized
	ArrayList<String> list3 =new ArrayList<>(Arrays.asList("Manish","janya","Rahul"));
	//Where as A Vector is Synchronized
	//Implements List Interface
	//Only One Thread can Access the Object in the Vector
	List<Integer> list4=new Vector<Integer>();
	//Vector is Not Fast
	
	
	
	list.add(1);
	System.out.println(list.size());
	System.out.println(list);
	
	list2.add(21);
	System.out.println(list2);
	
	Collections.sort(list);
	System.out.println(list);
	
	//For each Loop
	for(String name:list3) {
		System.out.println(name);
	}
	
	
	
	}
}
//https://chatgpt.com/share/677d41fb-1d60-8007-b948-c242d1f796ca
//More Information in this Link


//In Java, a Collection is a framework that provides a set of classes and interfaces to handle a group of objects. It is a part of the java.util package and is used to store, retrieve, and manipulate data in various ways. Collections in Java are used to work with data like lists, sets, and maps.
//
//Types of Collections in Java
//List: An ordered collection that allows duplicates.
//
//Example: ArrayList, LinkedList, Vector
//Set: A collection that does not allow duplicates, meaning each element can only appear once.
//
//Example: HashSet, LinkedHashSet, TreeSet
//Queue: A collection that represents a queue, where elements are added at the end and removed from the front.
//
//Example: LinkedList, PriorityQueue
//Deque: A double-ended queue where elements can be added or removed from both ends.
//
//Example: ArrayDeque, LinkedList
//Map: A collection that holds key-value pairs, where each key maps to a specific value.
//
//Example: HashMap, TreeMap, LinkedHashMap, Hashtable
//Core Interfaces in the Collection Framework
//Collection: The root interface in the hierarchy, which is extended by other interfaces like List, Set, and Queue.
//List: Extends Collection; allows storing elements in a sequence and supports indexed access.
//Set: Extends Collection; ensures no duplicate elements.
//Queue: Extends Collection; represents a queue for holding elements.
//Map: Not a direct child of Collection, but a part of the Collections framework that stores key-value pairs.
//Important Methods
//add(E e): Adds an element to the collection.
//remove(Object o): Removes an element from the collection.
//size(): Returns the number of elements in the collection.
//clear(): Removes all elements from the collection.
//contains(Object o): Checks if an element is present in the collection.
//Collections can be used to manage data efficiently depending on the use case, such as ordered data (List), unique elements (Set), or key-value pairs (Map).
