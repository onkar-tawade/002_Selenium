package _01seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class FirstSeleniumScript {

	public static void main(String[] args) {
		
		///Launch Browser (Chrome)
//		ChromeDriver dr =new ChromeDriver();
		
		WebDriver driver =new ChromeDriver(); ///This is possible because WebDriver is a parent
		
		
		
		///Open URL https://demo.opencart.com/
		
		driver.get("https://www.qa.jbktest.com/");

		
		
		/// Validate title should be "Online Quiz to test your skills in Java,Python,MySQL,Testing".....
		
		String actName = driver.getTitle();
		
		if(actName.equals("Online Quiz to test your skills in Java,Python,MySQL,Testing")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");

		}
		
		/// Close browser
		
		driver.close();
		
	}

}
					