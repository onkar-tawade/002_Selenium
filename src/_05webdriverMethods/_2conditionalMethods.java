package _05webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2conditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		boolean stsD = driver.findElement(By.xpath("//input[@placeholder='Search store']")).isDisplayed();
		System.out.println(stsD);

		
		boolean stsE = driver.findElement(By.xpath("//button[normalize-space()='Search']")).isEnabled();
		System.out.println(stsE);
		
		WebElement stsS = driver.findElement(By.xpath("//label[normalize-space()='Poor']"));
		stsS.click();
		System.out.println(stsS.isSelected());
		System.out.println(stsS.isSelected());

        

	}
}
