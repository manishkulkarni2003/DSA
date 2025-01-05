package OOPS.generics;

public class compareExample implements Comparable<compareExample> {
	int rollno;
	float marks;
	public compareExample(int rollno, float marks) {
		
		this.rollno = rollno;
		this.marks = marks;
	}
	@Override
	public int compareTo(compareExample o) {
		// TODO Auto-generated method stub
		int diff =(int)(this.marks-o.marks);
		
		return diff;
	}
	@Override
	public String toString() {
		return "compareExample [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	
	
	

	
	
}
