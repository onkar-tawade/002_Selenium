package _18CaptureScreenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificPageScreenshot {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//// 2] here we capture screenshot of specific section of page..............
		
		WebElement ss = driver.findElement(By.xpath("//div[@id='carbonads']"));
		File sourcefile = ss.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("E:\\Testing JBK\\Screenshots\\ss13.png");
		
		sourcefile.renameTo(targetfile);/// copy source file to targetfile
	}

}
