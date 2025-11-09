package week3.day1;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// 1. Create the array
		int[]  arr={1, 4,3,2,8, 6, 7};  
		
		//2.Sort the array  (index 0,1,2,3,4,5,6)  
		 Arrays.sort(arr);      //{1,2,3,4,6,7,8}
		 
		 //3.loop
		 for(int i=0;i<=arr.length;i++) {
			 
			 if (arr[i] != i + 1) {
				  
				 System.out.println("Missing Elemment is:"+(i+1));
				 break;
			 }
			 
		 }
	
}
}
