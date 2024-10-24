package _16javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _DemojavascriptExecutor {

	public static void main(String[] args) {
       
		//// Usiing javaScriptExecutor we do many actions/operations. We can Handle different kind of Scenario....
		
		WebDriver driver = new ChromeDriver(); // when we create object using WebDriver class...it is need typecast while store in JavaScriptExecutor variable...because there is no any relationship....
//		ChromeDriver driver = new ChromeDriver();//when we create object using ChromeDriver class...there is no need to Typecast while store in javaScriptExecutor.....because ChromeDriver is child of javaScriptExecutor interrface..
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement nameBox = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; /// here we create variable of javaScriptExecutor...we assigned driver object to javaScriptExecutor variable..we do type csting..
		                                                       ///we can not create object of it because javascriptExecutor is an interface...
		
		/// so here our target is to do sendKeys() method using executeScript( key, object) method.... it is an alternative of sendkeys method...
		js.executeScript("arguments[0].setAttribute('value','Omkar')",nameBox);/// so here it is javascript...... at arguments[0] there nameBox webelement will be store...
		                                                                       ///arguments[0] is predefined array...
		
		/// so here we do alternative for click() method..........
		WebElement mradiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", mradiobtn);///alternative for click() method..........
		
		
	}

}
