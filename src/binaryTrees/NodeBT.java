package binaryTrees;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int key) {
		data=key;
		left=null;
		right=null;
		}
}
public class NodeBT {
	//preorder Traversal
	public static void preorder(Node root,List<Integer> arr) {
		if(root==null) {
			return;
		}
		arr.add(root.data);
		preorder(root.left,arr);
		preorder(root.right,arr);
		
	}
	//function to initiate preorder Traversal
	
	public static List<Integer> preOrder(Node root) {
		List<Integer> arr=new ArrayList<>();
		
		preorder(root,arr);
		
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
		List<Integer> res=preOrder(root);
		System.out.println("Pre Order Traversal");
		
		for(int val:res) {
			System.out.println(val+" ");
		}
		System.out.println();
		
		
	}
}
