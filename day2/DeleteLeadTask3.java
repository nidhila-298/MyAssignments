package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeadTask3 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		// 1.Instantiate create
		ChromeDriver driver = new ChromeDriver(options);

		// 2.url using get method
		driver.get("http://leaftaps.com/opentaps/");

		// 3.Maximize
		driver.manage().window().maximize();

		// 4.username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// 5.password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 6.login
		driver.findElement(By.className("decorativeSubmit")).click();

		// 7.click crm/sfa
		driver.findElement(By.partialLinkText("CRM")).click();

		// 8.Leads tab
		driver.findElement(By.linkText("Leads")).click();

		// 9.find leads
		driver.findElement(By.linkText("Find Leads")).click();
		

		// 10.phone tab
		driver.findElement(By.linkText("Phone")).click();

		// 11.enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");

	
		// 12.find leads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);

		//13. Capture lead ID of first resulting lead
		WebElement firstLead = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));                      
		String leadID = firstLead.getText();
		System.out.println("Captured Lead ID: " + leadID);

		// Click on the first resulting lead
		firstLead.click();
		Thread.sleep(2000);

		// Click "Delete" button
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(2000);
		//click find leads again
		driver.findElement(By.linkText("Find Leads")).click();
	
		//enter the captured lead id
		driver.findElement(By.name("id")).sendKeys(leadID);
		Thread.sleep(2000);

		// Click "Find Leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);  
		
		// Verify the presence of the message “No records to display”
        WebElement noRecordsMsg = driver.findElement(By.className("x-paging-info"));
        String msgText = noRecordsMsg.getText();
        
        if (msgText.equals("No records to display")) {
            System.out.println("Lead deletion verified Message: " + msgText);
        } else {
            System.out.println("Verification failed Message displayed: " + msgText);
        }

        // Close the browser
        driver.close();

	}

}
