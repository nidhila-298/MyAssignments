package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbRegistrationTask1 {

	public static void main(String[] args) throws InterruptedException {
		//1.Instantiate create
        ChromeDriver driver=new ChromeDriver();
        
        //2.url using get method
        driver.get("https://en-gb.facebook.com/");
        
        //3.Maximize
        driver.manage().window().maximize();
        
        //4.implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //5.Create account
        driver.findElement(By.linkText("Create new account")).click();
        
        //6.firstname
        driver.findElement(By.name("firstname")).sendKeys("lumi");
        
        //7.surname
        driver.findElement(By.name("lastname")).sendKeys("pranika");
        
        //8.mobile no and email address
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        
        //9.new password
        driver.findElement(By.id("password_step_input")).sendKeys("pranika");
        
        //10.all three dropdown date of birth
        WebElement date = driver.findElement(By.id("day"));
        Select sel=new Select(date);
        sel.selectByIndex(3);   //4
        
        WebElement month = driver.findElement(By.id("month"));
        Select sel1=new Select(month);
        sel1.selectByValue("2");  //feb
        
        WebElement year = driver.findElement(By.id("year"));
        Select sel2=new Select(year);
        sel2.selectByVisibleText("2021"); //2021
                      //select radio button
        // Click Female using xpath and AND Operator
        driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
        Thread.sleep(1000);

        // Click Male using xpath and AND Operator
        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
        Thread.sleep(1000);

        // Click Custom using xpath and AND Operator
        driver.findElement(By.xpath("//input[@name='sex' and @value='-1']")).click();
        Thread.sleep(1000);

  	}

}
