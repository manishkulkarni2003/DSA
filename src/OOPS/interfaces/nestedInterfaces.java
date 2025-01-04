package OOPS.interfaces;

public class nestedInterfaces {
	public interface NestedInFace{
		boolean isOdd(int num);
	}
}

class B implements nestedInterfaces.NestedInFace{

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return (num & 1)==1;
	}
	
}

