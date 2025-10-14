package week1.day2;

public class IsPrime {

	public static void main(String[] args) {

		int givenNumber=4;
		
		boolean prime=true;
		for(int i=2;i<givenNumber;i++) {
			if(givenNumber%i==0) {
				prime=false;
				break;
			}
	}

	if(prime==true) {
		System.out.println("prime number:"+givenNumber);
	}
	else {
		System.out.println(givenNumber+" " +"Not prime number");
	}

}}

