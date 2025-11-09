package week3.day2;

public class Edge extends Browser {
	
	public void takeSnap() {

		System.out.println("takeSnap---->edgeclass");
	}

	public void clearCookies() {

		System.out.println("clearCookies---->edgeclass");
	}
	public static void main(String[] args) {
		Edge e=new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
	    e.takeSnap();
	    e.clearCookies();
	  
	}
	

}
