package bit_manipulation;

public class clearIthbit {
	//Get the bit value at the "i"th position of "num".

//2. Set the bit at the "i"th position of "num".

//3. Clear the bit at the "i"th position of "num".
	public static int[] bitManipulation(int num, int i){
        // Write your code here.
        return new int[]
        {num>>i-1 & 1,num|(1<<(i-1)),num&(~(1<<(i-1)))};
        
    }
}
