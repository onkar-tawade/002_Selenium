package _05webdriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4impicitWait {

	public static void main(String[] args) throws InterruptedException {

		// implicit wait..............
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// we only write this method once....write after the object creation of WebDriver...it executed for all the statements...
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		Thread.sleep(10000);
		
		driver.close();
		
	}

}
