package _13mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragANDdrop {

	public static void main(String[] args) {
		
		/// Drag and Drop....... we can only within application do drag and drop....
		/// so in drag & drop there is two term source element & target element...
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		/// all the Source elements.....
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));

		/// all the Target elements.....
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement southkorea = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement unitedstates = driver.findElement(By.xpath("//div[@id='box103']"));


		
		Actions act = new Actions(driver);
		
		//// here we drag & drop the element using action class method....
		act.dragAndDrop(rome, italy).build().perform();
		act.dragAndDrop(madrid, spain).build().perform();
		act.dragAndDrop(oslo, norway).build().perform();
		act.dragAndDrop(copenhagen, denmark).build().perform();
		act.dragAndDrop(seoul, southkorea).build().perform();
		act.dragAndDrop(stockholm, sweden).build().perform();
		act.dragAndDrop(washington, unitedstates).build().perform();
	}

}
