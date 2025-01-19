package OOPS.multithreading;

public class implementrunnableInterface {

	
	public static void main(String[] args) {
	
	Runnable obj =new demo2();
	obj.run();
	
	}
}
class demo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Created USing Runnable Interface");
	}
	
}
