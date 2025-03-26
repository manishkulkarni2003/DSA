package cognizant.Pyq;

import java.util.Arrays;

public class duplicateArr {
	public static void main(String[] args){
        int[] arr={1,2,1};
        System.out.println(Arrays.toString(duplicateArr(arr)));
    }
    public static int[] duplicateArr(int []arr){
       int n=arr.length;
       int[] res=new int[2*n];
       for(int i=0;i<n;i++){
           res[i]=arr[i];
           res[i+n]=arr[i];
       }
       return res;
    }
	
}
