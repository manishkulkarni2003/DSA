package OOPS;

//this is How We import Functions or files into Our Packages;
import static com.sorting.bubbleSort.BubbleSort;

import java.util.Arrays;
public class importExamples {
	
	public static void main(String[] args) {
		int [] arr= {1,2,7,5,3,4};
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
