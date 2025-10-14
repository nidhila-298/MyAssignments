package week1.day2;

public class Fibonacci_series {

	public static void main(String[] args) {
        
		int num1=0;
		int num2=1;
		
		System.out.println("Fibonacci Series:");
		for(int i=0;i<8;i++)
		{
			System.out.print(num1+" ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
		
	}

}



