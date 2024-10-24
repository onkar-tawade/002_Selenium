package _14sliders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {

		/// so here we have only source element not have target element..... then also we do drag & drop here..........
		/// getLocation() method belongs to WebElement not a driver...& it return Point type of object ...(x,y)
				///if we want only x axis value  then use------->getLocation().getX()
				///if we want only x axis value  then use------->getLocation().getY()
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);/////  makring object of Action class..............

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		//// Min slider.....
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		Point pos1 = min_slider.getLocation(); 
		System.out.println("Default position of min slider : "+pos1);
		act.dragAndDropBy(min_slider,100,250 ).build().perform();//// so using dragAndDropBy(min_slider,350, 0) we slid the slider...
		Point pos2= min_slider.getLocation();
		System.out.println("After sliding position of min slider : "+pos2);
		
		
		
		////Max slider............
		WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Default position of max slider: "+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -49, 250).perform();/////  so her we slide the max slider........so we pass the minus value to slide...
		System.out.println("After sliding position of max slider: "+max_slider.getLocation());
	}

}
