package _10autosuggestedDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggested {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Virat Kohli");
		
		Thread.sleep(5000);// here we use sleep method for giving time to autosuggest the options................
		
		List<WebElement> options= driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println(options.size());
		for (WebElement sugggOptions : options) {
			if (sugggOptions.getText().contains("age")) {
				System.out.println(sugggOptions.getText());

				sugggOptions.click();
				break;
			}
			
		}
	}

}
