package _19Optionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _11chromeoption {

	public static void main(String[] args) {

		//// ChromeOptions..........
		///  default class...predifined class...& for every browser there is specific Options class....eg. 1.for chrome ther is ChromeOptions...1.for Edge ther is EdgeOptions
	    /// use those for multiple purposes.....
		/// 1. using this class we control the settings of browser....using methods of it...
	    /// we can achieve Headless testing....[In this we can not see the actions which performs on webpage]
		
		ChromeOptions chrmop = new ChromeOptions();
		chrmop.addArguments("--headless=new");//// actual setting for headless mode of execution.....
		
		
		WebDriver driver = new ChromeDriver(chrmop); /// here we pass the object of ChromeOptions class so that setting will be applicable....0
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		
		
		
	}

}
			