package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the window
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Contacts tab
		driver.findElement(By.linkText("Contacts")).click();

		// Click on Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();

		// Click on the widget of "From Contact"
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

		Thread.sleep(2000);

		// Get all open window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// convert set into list
		List<String> allWindowsList = new ArrayList<>(windowHandles);

		// Switch to the new window (index 1)
		driver.switchTo().window(allWindowsList.get(1));

		// - Click on the first resulting contact.
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		// Switch to the new window (index 0)
		driver.switchTo().window(allWindowsList.get(0));

		// 🔟 Click on the "To Contact" lookup icon
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(2000);

		// 1️⃣1️⃣ Handle window switching for "To Contact"
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> allWindowsList2 = new ArrayList<>(windowHandles2);

		// Switch to the second popup window
		driver.switchTo().window(allWindowsList2.get(1));
		Thread.sleep(2000);

		// Click on the second resulting contact
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();

		// Switch back to the main window
		driver.switchTo().window(allWindowsList2.get(0));

		// - Click on the Merge button
		driver.findElement(By.className("buttonDangerous")).click();

		// - Accept the alert.
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// - Verify the title of the page.
		String title = driver.getTitle();
		System.out.println("Page Title after merge: " + title);

		if (title.equals("Merge Contacts | opentaps CRM")) {
			System.out.println("Title verification successful");
		} else {
			System.out.println("Failed");

		}

	}
}
