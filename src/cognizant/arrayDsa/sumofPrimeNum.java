package cognizant.arrayDsa;
import java.util.Scanner;
public class sumofPrimeNum {
	
	
	    public static void main(String[] args){
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter the Size of the Array");
	        int n=sc.nextInt();
	        
	        int[] arr=new int[n];
	        System.out.println("Enter the Elements in the Array");
	        
	        for(int i =0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Sum of PrimeNumbers Are :");
	        System.out.println(SumOfPrimeNumbers(arr));
	        
	        }
	    public static int SumOfPrimeNumbers(int[]arr){
	        int sum=0;
	        for(int i=0;i<arr.length;i++){
	            if(isPrime(arr[i])){
	                sum+=arr[i];
	            }
	        }
	        return sum;
	        
	        
	    }
	    public static boolean isPrime(int n ){
	        
	        if(n<2) return false;
	        
	        for(int i=2;i*i<=n;i++){
	            if(n%i==0){
	                return false;
	            }
	        }
	        return true;
	    }
	}

