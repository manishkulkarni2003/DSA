package bit_manipulation;

public class checkithBitISSetOrNot {
	public static void main(String[] args) {
		
	}
	//in code studio
	static boolean isKthBitSet(int n, int k) {
        // Write your code here.

    

        int mask=1<<(k-1);

        return((n & mask)!=0)?true:false;
    }
	//this is write in the geeks for geeks
	 static boolean checkKthBit(int n, int k) {
	        // Your code here
	       if(((n>>k)&1)==0){
	           return false;
	       }else{
	           return true;
	       }
	    }
}
