package OOPS.interfaces;

public class car implements engine,brake,media  {

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("I Break Like A Normal car");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I Start Engine Like a Normal Car");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I Stop Enigne  Like A Normal Car");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("I Accelerate Like A Normal Car");
	}
	
	
}
