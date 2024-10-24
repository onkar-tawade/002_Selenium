package _19Optionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://text-compare.com/");

	}

}
