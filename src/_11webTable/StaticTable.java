package _11webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		///1. find total no. of rows.............
		List<WebElement> alltr = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));//  also we use xpath on the basis of tagname....By.tagname("tr")....
		                                                                                          //.we use tagname apporoach if there is only one WebTable
		System.out.println("No. of rows in Webtable are:"+alltr.size());
		
//		
//		///find total no. of columns in table......
//        driver.
		
//		///Read data from specific row and column.....
//		
//		
//		///Read data from all the rows and columns.......
//		
//		
//		///Print book name whose author is Mukesh.............
//		
//		
//		///Find total price of all books.......
//		
		
		
	}

}
