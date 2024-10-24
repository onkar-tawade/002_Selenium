package _13mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rbuttton = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));/// capture the button....
		
		Actions act = new Actions(driver); ///Action class object..........
		
		act.contextClick(rbuttton).build().perform();///// for perform right click on element we use .contextClick(WebElement) method....
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();

        driver.switchTo().alert().accept();
		
	}

}
