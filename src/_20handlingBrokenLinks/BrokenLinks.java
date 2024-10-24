package _20handlingBrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		/// The condition required to find out the broken links...
		/// 1. Links have href attribute-----------> href="https://xyz.com"...................
		/// 2. Links------> request to server------> status code..............
		/// 3. status code must be >= 400..... then called the link as Broken link......
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("http://www.deadlinkcity.com");
		/// 1st of all find out all the links............
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links are: "+ links.size());
		
		
		int brokenLinks =0;///// use to count broken links....
		
		for (WebElement checklink : links) {
			String hrefattributeValue = checklink.getAttribute("href");
			
			if (hrefattributeValue==null || hrefattributeValue.isEmpty()) {
				System.out.println("href value is null or empty so we cant check the broken or not....");
				continue; //// continue skip the element and take next element...
			}
			
			try {
				//// hit url to the server.............
				URL linkURL = new URL(hrefattributeValue); /// this converted href value from string to URL format....
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); /// open connection to the server...........
				conn.connect();/// connect to server & sent request to the server...
				
				if (conn.getResponseCode() >= 400) {
					//// validate broken or not............
					System.out.println(hrefattributeValue+"=========> is broken link");
					brokenLinks++;
				}
				else {
					System.out.println(hrefattributeValue+"=========> is not broken link");

				}
			} catch (Exception e) {
				
			}
			
		}
		
		System.out.println("No. of broken links: "+ brokenLinks);

	}

}
