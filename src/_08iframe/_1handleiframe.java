package _08iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1handleiframe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // here we used implicit wait....
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']")); // here we create webelement for passsing as a 
                                                                                      //    argument in switchTo.frame method...
		driver.switchTo().frame(frame1);  // here we switch to  frame 1.....  pass frmae as a webelement............
	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello");
	    
	    
	    
	    // For go back to one frame to the main page use following command.......we can not directly pass one frame to another frame...
	    driver.switchTo().defaultContent();
	    
	    
		// Handling Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));// here wee again make webelement for switch to frame
        driver.switchTo().frame(frame2);// here switch to 2nd frame.........
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
	    
	    // For go back to one frame to the main page use following command.......we can not directly pass one frame to another frame...
	    driver.switchTo().defaultContent();

		// Handling Frame 3 ( frame 3 also contain the inner frame.......)
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("You are easy to learn and i will get job in this month....");

        // Handling inner iframe.....it is the part of 3rd frame.......
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@aria-label='I am a human']")).click();
        WebElement dropdown1 = driver.findElement(By.id("i19"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;//// here we use javascript exicutor....
        js.executeScript("arguments[0].click();", dropdown1);/// here use method of javascript------------>"arguments[0].click();", dropdown1
        
//        driver.switchTo().defaultContent();
	}

}
