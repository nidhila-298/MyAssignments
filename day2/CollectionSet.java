package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		//initialized a String array		
		String name="google";
		char[] charArray = name.toCharArray();
		//convert into set
		Set<Character> unquie=new LinkedHashSet<Character>();
		//loop
		for(int i=0;i<charArray.length;i++) {
			
			unquie.add(charArray[i]);
			
		}
		for (Character character : unquie) {
			System.out.print(character);
		}

	}
}
