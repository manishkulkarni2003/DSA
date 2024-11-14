package striverArrays;

public class findTheMissingNumber {
	public static void main(String[] args) {
		int [] arr= {1,2,4,5};
		System.out.println(missingNumber(arr));
		
		
	}
	//brute force
	static int Missing(int[] nums) {
		for(int i=0;i<=nums.length;i++) {
			int flag =0;
			for(int j=0;j<nums.length;j++) {
				if(nums[j] ==i) {
					flag =1;
					break;
				}
			}
			if(flag ==0) return i;
			
		}
		return -1;
	}
	//better Solution
	static int missingNumber(int[] nums) {
        int[] hash =new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;

        }
        for(int i=0;i<=nums.length-1;i++){
            if(hash[i] ==0) return i;
        }
        return -1;
        
    }
	//optimal Solution 
	static int missing(int[] nums) {
		int sum =(nums.length*(nums.length+1))/2;
        int s2=0;
        for(int i=0;i<nums.length;i++){
            s2=s2+nums[i];
        }
        int missingNumber =sum-s2;
        return missingNumber;
	}
	static int OptimalMissingz(int nums[]) {
		int xor1 =0;
		int xor2=0;
        for(int i=1;i<nums.length;i++){
            xor2=xor2^nums[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^nums.length;
        return (xor1^xor2);

    }
	}

}
