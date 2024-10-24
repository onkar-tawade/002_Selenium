package _03XpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manuallyXpath {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		/// 1.Xpath with single attribute..............
//		driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("MacBook");
		
		/// 2.Xpath with multiple attributes..............
//		driver.findElement(By.xpath("//input[@placeholder='Search store'][@id='small-searchterms']")).sendKeys("MacBook");
		
		///	3.Xpath with and operator.............
		
//    	 driver.findElement(By.xpath("//input[@placeholder='Search store' and @id='small-searchterms']")).sendKeys("MacBook");///needs both attribute correct
    	 
		///	4.Xpath with or operator.............

//		 driver.findElement(By.xpath("//input[@placeholder='Search store' or @id='small-']")).sendKeys("MacBook");///needs anyone attribute correct
		
		///	5.Xpath with inner text (using text() method)............
//		 driver.findElement(By.xpath("//a[text()='Build your own computer']")).click();
//		boolean text = driver.findElement(By.xpath("//strong[text()='Featured products']")).isDisplayed();
		
//		String stext = driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
//		System.out.println(stext);
		
		
		///	6.Xpath with contains method..............
//		driver.findElement(By.xpath("//input[contains(@placeholder,'sto')]")).sendKeys("Mobile Battery");
		
	    /// 7. Xpath with starts-with method...........
		driver.findElement(By.xpath("//input[starts-with(@autocomplete,'of')]")).sendKeys("Mobile Battery");
		
		/// 8. Chained Xpath.............
//		boolean imgStatus= driver.findElement(By.xpath("//div[@class='picture']/a/img")).isDisplayed();
//		System.out.println(imgStatus);
		

	}

}
