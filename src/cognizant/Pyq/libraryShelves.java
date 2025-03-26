package cognizant.Pyq;
//debugging Left
public class libraryShelves {
	public static void main(String[] args){
        int[] arr={3,7,5,6};
        System.out.println(libraryShelves(arr,5));
    }
    
    public static int libraryShelves(int[]arr,int k){
        int n=arr.length-1;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isPrime(arr[i])){
                sum+=Math.min(k,arr[i-1]);
            }
        }
        return sum;
        
        
    }
    public static boolean isPrime(int n){
        if(n<2){
            return  false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
