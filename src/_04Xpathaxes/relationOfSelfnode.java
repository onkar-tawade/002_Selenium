package _04Xpathaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relationOfSelfnode {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
		
//		1.Locating child element
//		driver.findElement(By.xpath("//form[@action='/search']/child::input")).sendKeys("Succesful");
		
//		2.Locating descendant element
//		driver.findElement(By.xpath("//div[@class='search-box store-search-box']/descendant::input")).sendKeys("Succesful");
		
//		3.Locating preceding-sibling element.........
//		driver.findElement(By.xpath("//button[@type='submit']/preceding-sibling::input")).sendKeys("Succesful");
		
//		4.Locating following-sibling element.........
        driver.findElement(By.xpath("//input[@type='text']/following-sibling::button")).click();
		
        
	}

}
