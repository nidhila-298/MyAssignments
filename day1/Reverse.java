package week3.day1;

public class Reverse {

	public static void main(String[] args) {
		
		//initialized String
		      String companyNmae="TestLeaf";
		      
		      //convert string into toCharArray
		      char[] charArray = companyNmae.toCharArray();
		      //loop
		      for(int i= charArray.length-1;i>=0;i-- )
		      {
		    	System.out.print(charArray[i]);  
		      }
	}

}
