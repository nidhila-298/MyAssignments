package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadTask2 {

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
			
        //8.Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//9.Create Lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//10.Enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nidhila");
		
		//11.LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manoj");
		
		//12.CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		//13.Enter title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		
		//14.click create lead button
		driver.findElement(By.name("submitButton")).click();
       
		//15.print title
		System.out.println(driver.getTitle());
         
		//16.close browser
		driver.close();

            
	}

}
