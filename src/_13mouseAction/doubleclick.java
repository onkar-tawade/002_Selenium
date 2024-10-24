package _13mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		
		/// 1st we capture the frame .......switch to that frame....
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.id("field1"));// locate the 1st inputBox...
		WebElement box2 = driver.findElement(By.id("field2"));// locate the 2nd inputBox...

		box1.clear();// clear the default text...........
		box1.sendKeys("I have get job in this August Month...");
		
		/// Double click action on button....

		Actions act = new Actions(driver);///////// make object of action class to use methods of it.......
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		act.doubleClick(button).build().perform();//////// for double click use the .doubleClick(WebElement) mwthod.............
		
		
		/// Validate that box2 also contains the same text which is in box1....
		if (box1.getAttribute("value").equals(box2.getAttribute("value"))) {
			System.out.println("Both input boxex have same content.......");
		}
		else {
			System.out.println("Not contains same content");
		}
	}

}
