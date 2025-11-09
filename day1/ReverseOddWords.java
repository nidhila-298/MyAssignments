package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		//initialized String
		String test = "I am a software tester"; 
		//split the words
		String[] words = test.split(" ");
		//loop
		for(int i=0;i<words.length;i++) {
			//odd condition
			if(i%2==1) {
				//convert string into toCharArray
				char[] charArray = words[i].toCharArray();
				//for each loop 
				for(int j=charArray.length-1;j>=0;j--) {
					
					System.out.print(charArray[j]);
				}
				
			}
			else {
				
				System.out.print(words[i]);
			}
			
			System.out.print(" ");
		}
		
	}

}
