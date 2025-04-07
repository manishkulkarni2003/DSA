package TwoPointer_Sliding_Window_problems;

public class maximumPointsYouCanObtain {
	public static void main(String[] args) {
		
	}
	public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;
        
        int rightIndex=cardPoints.length-1;
       for(int i=0;i<k;i++){
        leftSum+=cardPoints[i];
        
       } 
       maxSum=leftSum;
       
       for(int i=k-1;i>=0;i--){
        leftSum=leftSum-cardPoints[i];
        rightSum=rightSum+cardPoints[rightIndex];
        rightIndex=rightIndex-1;
        maxSum=Math.max(maxSum,leftSum+rightSum);
       }
       return maxSum;
    }
}
