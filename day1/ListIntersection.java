package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		
		//initialized array 1 and 2
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
        // create an empty list
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
          //iteration and list adding the array1
		for (Integer num1 : array1) {

			list1.add(num1);
		}
		//iteration and list adding the array2
		for (Integer num2 : array2) {

			list2.add(num2);
		}
		//loop using (list2 contains method list1)
		for (int num : list1) {
            if (list2.contains(num)) {
                System.out.println(num);
            }
		

	}

}
	}
