package _05webdriverMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5navgmethoddd {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();

		
		Set<String> windIDs = driver.getWindowHandles();//we can extract individual itom of set collection...
		                                                 // .there is not a get method..so we convert set into list collection...
		
		
//		//Apporoach 1
//		List<String> listWindoIDs = new ArrayList(windIDs);
//		
//		String parebtID = listWindoIDs.get(0);
//		String childID = listWindoIDs.get(1);
//
//		//Here we use switch to() method for focuses on diff. windows..............
//		driver.switchTo().window(parebtID);
//		System.out.println(driver.getTitle());
//
//		driver.switchTo().window(childID);
//		System.out.println(driver.getTitle());
		
		
//		//Apporoach 2
		
		for (String winID : windIDs) {
			System.out.println(driver.switchTo().window(winID).getTitle());
		}

	}

}
