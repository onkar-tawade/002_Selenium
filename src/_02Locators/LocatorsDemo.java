package _02Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;

public class LocatorsDemo {

	public static void main(String[] args) {

		WebDriver wdr= new ChromeDriver();
		wdr.get("https://demo.nopcommerce.com/");
		wdr.manage().window().maximize();
		
		/// name Locators
//		wdr.findElement(By.name("q")).sendKeys("Computer");                         //If we want to store this then type of variable is WebElement

		
		/// id Locator
//		wdr.findElement(By.id("small-searchterms")).sendKeys("Omkar");
		
		/// linktext & partisllinktext        <---- these locators are only use for locating the links
//		wdr.findElement(By.linkText("Electronics")).click();   // here click() which is action performed on the element.....
//		 wdr.findElement(By.partialLinkText("ctroni")).click();  /// here only passed the part of linktext....Its not be prefferable because if any other 
		                                                          ///           linktext match with partial linktext then that another link will be open.
	
		 ///Classname locator
//		List<WebElement> headerLinksName = wdr.findElements(By.className("sublist-toggle"));
//		System.out.println(headerLinksName.size());
		
		
		 ///Tagname locator
	List<WebElement>links = wdr.findElements(By.tagName("a"));
	System.out.println("No. of links on Webpage: "+links.size());
	
	 List<WebElement> img= wdr.findElements(By.tagName("img"));
	 System.out.println("Total no. of images on webpage are: "+img.size());
          
		
		
	
	}

}
