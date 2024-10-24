package _16javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomInzoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		////// create variable of JavascriptExecutor............
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		
		js.executeScript("document.body.style.zoom='50%" );  /// set zoom level 50%.............
		Thread.sleep(5000);

		js.executeScript("document.body.style.zoom='80%" );  /// set zoom level 50%.............

		driver.close();
		
	}
}
