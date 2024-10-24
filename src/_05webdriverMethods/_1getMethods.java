package _05webdriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1getMethods {

	public static void main(String[] args) {

//		///Webdriver get methods............
//		1. get(url)            ->    open url on the browser.................
//		2. getTitle()          ->    return title of the page..................
//		3. getCurrentUrl()     ->    return URL of the page.................
//		4. getPageSource()     ->    return sourse code of the web page................
//		5. getWindowHandle()   ->    return ID of the Single Browser window................
//		6. getWindowHandles()   ->   return ID's of the multiple Browser windows................
				
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
//		String name = driver.getTitle();
//		System.out.println(name);
		
//		String Url = driver.getCurrentUrl();
//		System.out.println(Url);
		
//		String psrc = driver.getPageSource();
//		System.out.println(psrc);
		
		
//		String singleid = driver.getWindowHandle();
//		System.out.println(singleid);
		
		
		Set<String> multiid = driver.getWindowHandles();
		System.out.println(multiid);
		
		
	
	}

}
