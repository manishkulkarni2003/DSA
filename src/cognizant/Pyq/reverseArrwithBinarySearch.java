package cognizant.Pyq;
import java.util.*;
public class reverseArrwithBinarySearch {
	public static void main(String[] args){
        int[] arr={1,2,3,10,20,30};
        reverseArr(arr);
    }
    public static void reverseArr(int[] arr){
        int n=arr.length;
        int firstsum=0;
        int secondSum=0;
        for(int i=0;i<n/2;i++){
            firstsum+=arr[i];
        }
        for(int i=n/2;i<n;i++){
            secondSum+=arr[i];
        }
        if(firstsum<secondSum){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
        
    }
}
