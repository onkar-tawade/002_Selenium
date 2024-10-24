package _02Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	
	driver.manage().window().maximize();     ///maximize the window...........

//	/// Tag & id combination....
//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile");
//	
//	
//	/// Tag & class combination....
//	driver.findElement(By.cssSelector("button.button-1")).click();
//	
	
	/// Tag & attribute combination....
//	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Computer");
	
	
    ///Tag , class & attribute combination...
	driver.findElement(By.cssSelector("input.search-box-text[autocomplete=\"off\"]")).sendKeys("MacBook");
	

	
	}

}
