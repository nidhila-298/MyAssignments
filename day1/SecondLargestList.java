package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

	public static void main(String[] args) {

		//initialized an array 
		int[] arr={3, 2, 11, 4, 6, 7};
		
		//array into list
		List<Integer> list=new ArrayList<Integer>();
		//iterating, convert array into list
		for (Integer integer : arr) {
			list.add(integer);
		}
		//ascending order
		Collections.sort(list);
		//use get method
		int secondLargest=list.get(list.size()-2);
		//print the second largest number 
		System.out.println("The second largest number is: " + secondLargest);
	}

}
