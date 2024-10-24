package _12datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepicker2 {

	public static void main(String[] args) {

		
		String wantdate = "17";
		String wantmonth = "March";
		String wantyear = "2002";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		
		/// Open URL on browser
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	 /// here we switch to the frame..........
		driver.switchTo().frame("frame-one796456169"); // here we pass the id of iframe.....also we can pass the name........
		
////		driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).sendKeys("02/11/1945"); ///here we pass the value using sendKeys....
//		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		
		
		/// now clicking on calender icon............
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		
		
//		///For selecting the month..............
		for (int i = 0; i < i+1; i++) {
			String defMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (defMonth.equals(wantmonth)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		
		
//		///For selecting the year..............
		WebElement yeardrpdwn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select defyear = new Select(yeardrpdwn);/////////here we use select class object for select dropdown
		
		List<WebElement> yearOptions = defyear.getOptions();///////getOptions() method returns the options from dropdown..........
		
		for (WebElement y : yearOptions) {

			if (y.getText().equals(wantyear)) {
				y.click();
				break;
			}
		}
		
		
	
//		///For selecting the date..............

		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		for (WebElement dates : allDates) {
			if (dates.getText().equals(wantdate)) {
				dates.click();
				break;
			}
		}
		
	}

}
