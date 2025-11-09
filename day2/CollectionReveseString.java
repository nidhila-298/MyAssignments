package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionReveseString {

	public static void main(String[] args) {
		//initialized a String array
				String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
				//Add the String to a list  
				List<String> list=new ArrayList<String>();
				//Iterate the values in the list
				for(String words:array) {
					
					list.add(words);
				}
				
				//form ascending order sort()
				Collections.sort(list);
				//System.out.println(list);
				
				//then reverse()
				Collections.reverse(list);
				
				//Print the required output 
				System.out.println(list);

	}

}
