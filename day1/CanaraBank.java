package week4.day1;

public abstract class CanaraBank implements Payments {
    //implement all method in Payments interface
	public void cashOnDelivery() {
		System.out.println("processing cash delivery");
	}

	public void upiPayments() {
		System.out.println("processing upi payment");
	}

	public void cardPayment() {
		System.out.println("processing card payment");
	}

	public void internetBanking() {
		System.out.println("processing internetBank");
	}

	public void recordPaymentDetails() {
		System.out.println("processing recordPaymentDetails");
	}

}
