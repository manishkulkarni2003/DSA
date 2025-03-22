package OOPS.Practice;

class threadDemo extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread"+Thread.currentThread().getId()+"running");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
public class multiThreadingDemo {
	public static void main(String[] args) {
	
	threadDemo obj =new threadDemo();
	obj.start();
	
	}
}
