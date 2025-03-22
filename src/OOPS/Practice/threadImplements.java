package OOPS.Practice;

class threads implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
			System.out.println("running after sleep");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void start() {
		
		
	}
	
}
public class threadImplements {
	public static void main(String[] args) {
	
		threads obj =new threads();
		obj.start();
		obj.run();
		
	
	}
}
