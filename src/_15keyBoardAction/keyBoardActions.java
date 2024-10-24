package _15keyBoardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActions {

	public static void main(String[] args) {
	
		/// so here we use the method------->.keyDown(Keys.CONTROL) for press the key.......&......keyUp(Keys.CONTROL) for released the key....
		/// which key we press that same key we released......................
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);/////  makring object of Action class..............

		driver.get("https://text-compare.com/");
		
		///Loacte the textarea
		driver.findElement(By.name("text1")).sendKeys("I will get a job in 2 months...& the package is 4LPA...");
		
		/// Ctrl + a ----------------> select the text
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();//keyDown(Keys.CONTROL) for press the key.
		                                                                      //keyUp(Keys.CONTROL) for released the key.
		
		/// Ctrl + c ----------------> copy the text
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		
		/// Tab      ----------------> shift to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		

		/// Ctrl + v ----------------> paste the text
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		//// if we have to press 3 keys --------------> Ctrl+Shift+A..........then we do...
//		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform(); // at the time of release we 1st release the last press key...
		                                                                                                                          // last in 1st out use....In reverse direction we release..
		
		
		
}
}
