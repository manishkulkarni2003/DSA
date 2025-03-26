package cognizant.Pyq;
//max books read
import java.util.*;
public class booksPerArrPyqCog {
	public static void main(String[] args) {
        int[] arr={4,2,3,1};
        System.out.println(knowledgeEnhancement(arr,5));
    }
    public static int knowledgeEnhancement(int[] arr,int n){
        Arrays.sort(arr);
        int count=0;
        int totalTime=0;
        for(int time:arr){
            if(totalTime+time<=n){
                totalTime+=time;
                count++;
            }
        }
        return count;
    }
}
