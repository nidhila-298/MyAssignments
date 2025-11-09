package week3.day2;
//subclass
public class LoginTestData extends TestData {
	
	public void enterUsername() 
	{
        System.out.println("Sub class : EnterCredentials");
    }
	
	public void enterPassword()
	{
		
		System.out.println("sub class : Navigate To HomePage");
		
	}
	
	public static void main(String[] args) {
		
		LoginTestData data=new LoginTestData();
		data.enterCredentials();//sub class
		data.enterPassword();// sub class
		data.enterUsername();//super class
		data.navigateToHomePage();//super class
		
	}

	  

}
