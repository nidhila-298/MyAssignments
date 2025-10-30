package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTask4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		// 1.Instantiate create
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Enter username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();

		// Click on Create Account button
		driver.findElement(By.linkText("Create Account")).click();

		// Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys("My Test Account");

		// Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// Select Industry as ComputerSoftware
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industrySelect = new Select(industryDropdown);
		industrySelect.selectByVisibleText("Computer Software");

		// Select Ownership as S-Corporation
		WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipSelect = new Select(ownershipDropdown);
		ownershipSelect.selectByVisibleText("S-Corporation");

		// Select Source as Employee by value
		WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
		Select sourceSelect = new Select(sourceDropdown);
		sourceSelect.selectByValue("LEAD_EMPLOYEE");

		// Select Marketing Campaign as eCommerce Site Internal Campaign by index
		WebElement marketingDropdown = driver.findElement(By.name("marketingCampaignId"));
		Select marketingSelect = new Select(marketingDropdown);
		marketingSelect.selectByIndex(6);

		// Select State/Province as Texas by value
		WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateSelect = new Select(stateDropdown);
		stateSelect.selectByValue("TX");

		// Click on Create Account button
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		
		// print the accout name
		System.out.println(driver.getTitle());
		

		// Close the browser window
		driver.close();
	}

}
