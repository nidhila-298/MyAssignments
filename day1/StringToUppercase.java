package week3.day1;

public class StringToUppercase {

	public static void main(String[] args) {
		// string variable initialization
		 String test = "changeme"; 
		 
		// Convert the string to a character array
		 char[] charArray = test.toCharArray();
		 
		 //loop 
		 for(int i=charArray.length-1;i>=0;i--) {
			 
			 // condition given odd number
			 if(i%2==1) {
				 
				// change odd number character into uppercase
				 charArray[i] = Character.toUpperCase(charArray[i]);
			 }
		 }
		//for each loop to iterate forward direction
		for(Character each:charArray){
			System.out.print(each);
		}
	}

}
