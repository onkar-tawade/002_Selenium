package _12datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker1 {

	static void selectDMY(WebDriver driver, String date,String month,String year) { /// here we create a method for select date, month, year

		String selYear = year, selMonth= month;/// we want select these month and year........
		for (int i = 1; i < i+1; i++) {
			String defaultYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// here we get default year
			String defaultMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// here we get default month

			if(defaultYear.equals(selYear) && defaultMonth.equals(selMonth)) { /// here we compare  the strings ..........
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); /// click on forward button to select month and year..
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); /// click on Backward button to select month and year..

		}
		
		
		
		/// Below logic for selecting the date..........
        String selDate = date;
		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));//here we capture all the dates...
		
		for (WebElement dates : allDates) { /// here we iterate all the dates and select which we want....
			if(dates.getText().equals(selDate)) {
				dates.click();
			}
		}
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/// Open URL on browser
		driver.get("https://jqueryui.com/datepicker/");
		
		
		///Switch into frame...........
		WebElement frame0 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));/// creating webelement of frame...........
		driver.switchTo().frame(frame0);
		
		
//		//Here we select a date using sendKeys method...pass the string.....We can not use it everytime, because everytime input box not allow.....
//		driver.findElement(By.id("datepicker")).sendKeys("02/26/2002");
		
		
		/// Now we select using Capturing the element....
		driver.findElement(By.id("datepicker")).click();
		
		selectDMY(driver, "26", "March", "2026");//here we call the method
		
		
		
		
		
		
	}
}
