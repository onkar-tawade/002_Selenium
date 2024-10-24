package _15keyBoardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);/////  makring object of Action class..............
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']")); /// locate regiser ....option
		
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();/// here pass the register in  click method as webelement.....
		
		
	}

}
