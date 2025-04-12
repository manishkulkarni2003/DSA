package bit_manipulation;

public class countSetBits {
	public static int countSetBits(int n) 
    {
        //    Write your code here.
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=countBits(i);
        }
        return sum%1000000007;
       
    }
    public static int countBits(int x){
        int c=0;
        while(x!=0){
            if((x&1)==1){
                c++;
            }
            x=x>>1;
        }
        return c;
    }
}
