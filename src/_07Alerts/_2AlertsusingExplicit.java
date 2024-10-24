package _07Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _2AlertsusingExplicit {

	public static void main(String[] args) throws InterruptedException {

		// B] using explicitwait.................
		
		WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));////declaration of explicit wait.............
		
		driver.get("https://testautomationpractice.blogspot.com/");
		   //1..............Normal Alert with an OK button.....
				driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
				Thread.sleep(5000);
				
				Alert myalerts= mywait.until(ExpectedConditions.alertIsPresent());
				
                myalerts.accept();		
                
	}

}
