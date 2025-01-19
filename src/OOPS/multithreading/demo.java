package OOPS.multithreading;

public class demo  {
	//thread smallest indiviual unit inside the process inorder to complete the task
	//process is a task
	
	//sequential execution ->t1,2,3,4,5,6-->if t1 is executing others are in ideal state
	//multithreading -->parallel execution non sequential
	public static void main(String[] args) {
		
		thread myObj =new thread();
		
		myObj.start();
		
		myObj.run();
	}
	
	
	
	
}
class thread extends Thread{
	public void run() {
		try {
			
			for(int i=0;i<5;i++) {
				System.out.println("Thread"+Thread.currentThread().getId()+"Is Running");
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
