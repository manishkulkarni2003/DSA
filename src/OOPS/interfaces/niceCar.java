package OOPS.interfaces;

public class niceCar {
	private engine Engine;
	private media player=new cdplayer();
	//Different Classes Are used Here
	public niceCar() {
		Engine =new powerengine();
	}
	public niceCar(engine Engine) {
		this.Engine=Engine;
	}
	
	public void start() {
		Engine.start();
	}
	public void stop() {
		Engine.stop();
	}
	public void startMusic() {
		player.start();
		
	}
	public void stopMusic() {
		player.stop();
		
	}
	
	
}
