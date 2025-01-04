package OOPS.interfaces;

public class Main {
	public static void main(String[] args) {
	
	engine obj2 =new car();
	car obj=new car();
	obj.start();
	obj.acc();
	obj.brakes();
	
	media carMedia =new car();
	carMedia.stop();
	
//	obj2.brakes();
	//Not present in engine type
	niceCar car =new niceCar();
	car.start();
	car.startMusic();
	
	}
}
