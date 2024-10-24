package _13mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		
		/// Open URL on browser
		driver.get("https://demo.opencart.com/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver); ////////Here we use the Actions class....using method of its we do Hover.....
		
		
		/// for hover the element we use .moveToElement() method....
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();////////// at the end .build().perform() is mendatory........
//		act.moveToElement(desktop).moveToElement(mac).click().perform();////////// we can also use only perform() ...because perform method itself is able to build an action....
		
		

	}

}
