package cognizant.Pyq;

public class ancientNumber {
	public static void main(String[] args){
        int n=41;
        System.out.println(ancientnumber(n));
    }
    public static int ancientnumber(int n){
        int sum =0;
        while(n>0){
            int l=n%10;
            sum=sum+l;
            n=n/10;
        }
        int res=0;
        if(sum>9){
            while(sum>0){
                int l=sum%10;
                res+=l;
                sum=sum/10;
            }
            return res;
        }
        
        
        return sum;
        
        
    }
}
