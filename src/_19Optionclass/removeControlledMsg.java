package _19Optionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class removeControlledMsg {

	public static void main(String[] args) {

		/////  here we learn to remove "Chrome is being controlled by automated test software...."  message...
		ChromeOptions chrmop = new ChromeOptions();
		chrmop.setExperimentalOption("excludeSwitches" ,  new String[] {"enable-automation"});//// Using this we deleted the message....
		
		
		WebDriver driver = new ChromeDriver(chrmop); /// here we pass the object of ChromeOptions class so that setting will be applicable....0
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	}
	
	

}
