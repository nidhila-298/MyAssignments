package week3.day1;

public class PrintDuplicate {

	public static void main(String[] args) {

		//initialized Array
		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
        //loop
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
            	//compare duplicate
                if (num[i] == num[j]) {
                    System.out.print(num[i] + " ");
                  
                }
            }
        
        }
        }     
		
	}


