package cognizant.Pyq;

public class houseVisit {
	public static void main(String[] args){
        int[] arr={2,1,3,1};
        System.out.println(HouseVisit(arr));
    }
    public static int HouseVisit(int[] arr){
        int n =arr.length;
        int count=0;
        int i=1;
        while(n>=i){
            
            count++;
            i+=arr[i-1];
        }
        return count;
        
    }
}
