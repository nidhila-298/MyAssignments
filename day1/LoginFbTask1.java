package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFbTask1 {

	public static void main(String[] args) {
		     //1.Instantiate create
             ChromeDriver driver=new ChromeDriver();
             
             //2.url using get method
             driver.get("https://www.facebook.com/");
             
             //3.email id
             driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
             
             //4.password
             driver.findElement(By.id("pass")).sendKeys("Tuna@321");
             
             //5.login
             driver.findElement(By.name("login")).click();
             
             //6.print the title of the current page
			 System.out.println(driver.getTitle());

    	}

}
