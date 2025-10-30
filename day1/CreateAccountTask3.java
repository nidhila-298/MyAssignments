package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccountTask3 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		 
	     //1.Instantiate create
        ChromeDriver driver=new ChromeDriver(options);
        
        //2.url using get method
        driver.get("http://leaftaps.com/opentaps/");
        
        //3.Maximize
        driver.manage().window().maximize();
        
        //4.username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        
        //5.password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        //6.login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		//7.click crm/sfa
		driver.findElement(By.partialLinkText("CRM")).click();
			
       //8.Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//9.Create Create Account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//10.Enter Accountname
		driver.findElement(By.id("accountName")).sendKeys("Nidhila");
		
		//11.Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//12.number of employees
		driver.findElement(By.name("numberEmployees")).sendKeys("10");

		//13.Enter sitename
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//14.click create  button
		driver.findElement(By.className("smallSubmit")).click();
      
		//15.print title
		System.out.println(driver.getTitle());
        
		//16.close browser
		driver.close();
		

		
		
		
	}

}
