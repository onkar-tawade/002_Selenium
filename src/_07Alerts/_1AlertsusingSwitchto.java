package _07Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1AlertsusingSwitchto {

	public static void main(String[] args) throws InterruptedException {

		// ................3 kinds of Alerts/Popups.................
		// Alert is not the Webelement...we cant inspect it..
		
//		1. Normal Alerts           :-            Only get popup with ok button.......(We can not do any action....)
//		2. Confirmation Alerts     :-            Get popup with ok & cancel button.......(We can do here action....)
//		3. Prompt Alert            :-            Get popup with Input box, ok & cancel.......(Here we can pass any text also we can do actions....)
//We can handle alert window using switchTo() and explicitwait.......
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//here we used implicit wait....
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		// A] using switchTo() method..............
//		//   1..............Normal Alert with an OK button.....
//		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
//		Thread.sleep(5000);
//		
////		driver.switchTo().alert().accept();/// this alert() capture an alert window which opens on webpage.... accept() method accept the message.........
//		
//	    Alert myalrt = driver.switchTo().alert();
//	    System.out.println(myalrt.getText());
//	    myalrt.accept();
	    
		
		
//	    //   2....................Confirmation Alert with ok and cancel button.....................
//		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
//		Thread.sleep(5000);
//		
//		driver.switchTo().alert().accept();//This close the alert using ok button
//		driver.switchTo().alert().dismiss();//This close the alert using cancel button

		
		
//	    //   3....................Prompt Alert with ok and cancel button.....................
//        driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
//    	Thread.sleep(5000);
//
//        driver.switchTo().alert().sendKeys("Raju bhaiii");
//        driver.switchTo().alert().accept();
		
		

			
		
	}

}
