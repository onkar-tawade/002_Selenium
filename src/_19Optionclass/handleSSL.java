package _19Optionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleSSL {

	public static void main(String[] args) {

		
		/// here we learn how to handle SSL(Secure Socket Layer..).....
		/// some websites has that type of SSL... & if we access these type of Websites...that gives the Exceptions...
		/// for handling SSL we use ChromeOptions class....
		
//		
//		ChromeOptions op = new ChromeOptions();
//		op.setAcceptInsecureCerts(true); ///  .setAcceptInsecureCerts(true) this method we use to  handle or accept the SSL certificate....
//	
		
	    WebDriver driver = new ChromeDriver();  /// here pass op to driver because to apply this method.....
	    driver.get("https://expired.badssl.com/");
	    
	    
	    System.out.println("Title of page: "+ driver.getTitle()); ///privacy error.......we get..
	    
	    
	}

}
