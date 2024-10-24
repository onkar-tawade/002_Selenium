package _06checkBoxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1handleCheckBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Here is how to identify the links.....
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
		
		//1. select specific checkbox
//		driver.findElement(By.id("sunday")).click();
		
		
		
		//2.select all checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//		for (int i = 0; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//		}
		
//		for (WebElement chkbox : checkboxes) {  //use this type of loop inhanced for loop...........
//			chkbox.click();
//		}
		
//		//3.select last 3 checkboxes
//		int i=1;
//		for (WebElement chkbx : checkboxes) {
//                if(i>=5) {
//                	chkbx.click();
//                }
//                i++;
//		}

      
		//4.select one by one checkboxes

		int i=0;
		for (WebElement chbox : checkboxes) {
			if (i%2==0) {
				chbox.click();
			}
			i++;
		}

		
	}

}
