package _05webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _3waitMethods {

	public static void main(String[] args) throws InterruptedException {

		// Thread.sleep() method is a java method ........................
	    // 2 Wait methods are provided in selenium.... 1.implicit wait & explicit wait[in this another flavour of wait called fluent wait]...........
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
	}

}
