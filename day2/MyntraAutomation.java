package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAutomation {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// - Launch the URL

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// - In the search box, type as "bags" and press enter
		WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
		searchBox.sendKeys("Bags", Keys.ENTER);

		// - To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(3000);

		// categories under (+2more Click)
		driver.findElement(By.className("categories-more")).click();

		// under the category click laptop bag
		driver.findElement(By.xpath("(//label[contains(text(),'Laptop Bag')])[2]")).click();
		Thread.sleep(5000); // wait for results to load
		// - Print the count of the items found.
		WebElement itemCountElement = driver.findElement(By.className("title-count"));
		String itemCountText = itemCountElement.getText();
		System.out.println("Total items: " + itemCountText);
		System.out.println("-------Brands---------");

		Thread.sleep(5000); // wait for results to load
		// - Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> brand = driver.findElements(By.className("product-brand"));
		for (WebElement b : brand) {

			String text2 = b.getText();

			System.out.println("List of Brands: " + text2);

		}
		// - Get the list of names of the bags and print it
		Thread.sleep(5000); // wait for results to load
		List<WebElement> bagNames = driver.findElements(By.className("product-product"));
		for (WebElement ba : bagNames) {

			String text3 = ba.getText();
			System.out.println("List of BagNames: " + text3);

		}
	}

}
