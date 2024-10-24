package _16javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollPage {

	public static void main(String[] args) {

		/// We use javaScriptExecutor to scroll the page.............
		/// Scroll bar is not the part of Application.......so we can not loacate it...this is not a webelement....
		/// 3 ways to scroll the page....
		/// 1. Specify the pixel number & scroll down....
		/// 2. Scroll the page till element is visible...
		/// 3. Scroll the page till end of the page....
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://jqueryui.com/datepicker/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
//		/// 1] Scroll down the page by pixel number..........
//        js.executeScript("window.scrollBy(0,700)" , "");
//        System.out.println(js.executeScript("return window.pageYOffset;"));
         
		
//        /// 2]Scroll down till the element.....
//        WebElement img3rd = driver.findElement(By.xpath("//a[normalize-space()='Checkboxradio']"));
//        js.executeScript("arguments[0].scrollIntoView();", img3rd);
//        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        
        /// 3]Scroll till bottom of the page.........
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        
      /// 3]Scroll again to initial position of the page.........
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
