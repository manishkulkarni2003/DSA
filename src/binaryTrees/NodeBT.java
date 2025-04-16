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
	public static void inorder(Node root,List<Integer>arr) {
		if(root==null) {
			return;
		}
		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right,arr);
		
		
	}
	public static List<Integer> inOrder(Node root){
		List<Integer> arr=new ArrayList<>();
		inorder(root,arr);
		return arr;
	}
	//post order traversal
	public static void postorder(Node root,List<Integer>arr) {
		if(root==null) {
			return;
		}
		postorder(root.left,arr);
		postorder(root.right,arr);
		arr.add(root.data);
	}
	public static List<Integer> postOrder(Node root){
		List<Integer> arr=new ArrayList<>();
		postorder(root,arr);
		return arr;
	}
	//levelorder traversal
	public static List<List<Integer>> levelorder(Node root){
		List<List<Integer>> ans=new ArrayList<>();
		if(root==null) {
			return ans;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int size=q.size();
			List<Integer> level=new ArrayList<>();
			
			for(int i=0;i<size;i++) {
				Node node=q.poll();
				level.add(node.data);
				if(node.left!=null) {
					q.add(node.left);
				}
				if(node.right!=null) {
					q.add(node.right);
				}
				
			}
			ans.add(level);
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		
//		List<Integer> res=preOrder(root);
		List<Integer> res=inOrder(root);
		System.out.println("In Order Traversal");
		
		for(int val:res) {
			System.out.println(val+" ");
		}
		System.out.println();
		
		
	}
}
