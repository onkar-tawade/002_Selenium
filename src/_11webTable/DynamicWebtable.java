package _11webTable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
//		driver.findElement(null)
		
//      Count how many li tags on web table thats exactly equal to no. of pages.............
		
	}

}
