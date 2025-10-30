package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadTask2 {

	public static void main(String[] args) {

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

		// 9.Create Lead button
		driver.findElement(By.linkText("Create Lead")).click();

		// 10.company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

		// 11.first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("nidhila");

		// 12.lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Manoj");

		// 13.first name (local)
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Bappu");

		// 14.department field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");

		// description
		driver.findElement(By.name("description")).sendKeys("Lead description");

		// email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Nidhila@example.com");

		// state/province using Select class
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown =new Select(stateProvince);
		stateDropdown.selectByVisibleText("New York");

		// click create button
		driver.findElement(By.name("submitButton")).click();

		// Click edit button
		driver.findElement(By.linkText("Edit")).click();

		// ClearDescription Field
		driver.findElement(By.name("description")).clear();

		// important note field
		driver.findElement(By.name("importantNote")).sendKeys("Learning Selenium");

		// update button
		driver.findElement(By.name("submitButton")).click();

		// gettitle
		System.out.println(driver.getTitle());

		// close
		driver.close();

	}

}
