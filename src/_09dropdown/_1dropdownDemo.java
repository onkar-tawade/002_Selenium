package _09dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _1dropdownDemo {

	public static void main(String[] args) {

		/*                      There are 3 types of dropdown.......
		                       1. Select dropdown...........easy to handle.......also called default dropdown........old technology....
		                       2. Bootstrap dropdown........Latest application used 
		                       3. Hidden dropdown........Latest application used 
		                                                                                                 */
		      
//		1. Select dropdown :-   Select dropdown having the select tag.....
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement countydrdn = driver.findElement(By.xpath("//select[@class='form-control']")); // here we locate the dropdown
		                      // we can not directly use this webelement...because dropdown is one element inside this every option is another webelement....
		Select countyval = new Select(countydrdn);// here we use Select class.... making object of it and pass the webelement...using select class
		
		// Here we use three methods for select the dropdown options...............
//		countyval.selectByVisibleText("France");
//		countyval.selectByValue("india");  // value is an attribute of the element....
		countyval.selectByIndex(1);  // Here we pass the index number of options.....index value start from 0.
		
		/// here we capture and print all the dropdown options...................
		List<WebElement> countries = countyval.getOptions();
//		System.out.println(countries.size());
		
		/// herre printing the options of dropdown...
		//1. using normal for loop
		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i).getText());
		}
		
		//2. using E9999nhanced for loop

		for (WebElement contrys : countries) {
			System.out.println(contrys.getText());
		}
		
	}

}
