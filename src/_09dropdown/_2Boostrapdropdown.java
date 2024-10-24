package _09dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2Boostrapdropdown {

	public static void main(String[] args) throws InterruptedException {

		/// here we do not use the inbuilt method...................we only use the in built method for select dropdown............
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();// opens dropdown menu
        
//        //1] select single option dropdown..........
//        driver.findElement(By.xpath("//input[@value='Java']")).click();
		
        //Capture all the options and find out the size.....
       
        List <WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        
        
        //// here we select all the options
//        for(WebElement op : options) {
//        	
//        	if(  !(op.getText().equals("HTML") || op.getText().equals("CSS")) ) {
//        		op.click();
//        	}
//        }
        
        ////here we print the elements on console.........
        for(WebElement op : options) {
        	
        System.out.println(op.getText());
	}


	}
}
