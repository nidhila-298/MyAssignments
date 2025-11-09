package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		
		  
		        // Declare and initialize the list
		        List<Integer> numbers = new ArrayList<>();
		        Collections.addAll(numbers, 1, 2, 3, 4, 10, 6, 8);

		        // Sort the list in ascending order
		        Collections.sort(numbers);

		        System.out.println("Missing numbers in the sequence:");

		        // Check for missing numbers
		        for (int i = 0; i < numbers.size() - 1; i++) {
		            int current = numbers.get(i);
		            int next = numbers.get(i + 1);

		            // If there's a gap between current and next
		            if (current + 1 != next) {
		                // Print all missing numbers between current and next
		                for (int j = current + 1; j < next; j++) {
		                    System.out.println(j);
		                }
		            }
		        }
		    }
		}

		
		
	
