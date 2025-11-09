package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_of_Price {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        // Navigate to Amazon India
        driver.get("https://www.amazon.in");
        
        WebElement inputBox = driver.findElement(By.id("twotabsearchtextbox"));
        inputBox.sendKeys("Phone");
        inputBox.sendKeys(Keys.ENTER);
        
        List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price']"));
        System.out.println("Prices of all Mobile Phone");
        List<String> prices = new ArrayList<String>();
        for (WebElement webElement : allPrices) {
        	String text = webElement.getText();
        	//System.out.println(text);
        	prices.add(text);
		}
        System.out.println(prices);
    }
}
		
		
		
