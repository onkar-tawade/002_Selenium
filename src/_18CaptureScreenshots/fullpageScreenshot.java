package _18CaptureScreenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fullpageScreenshot {

	public static void main(String[] args) {

		/// before selenium 4 we used TakeScreenshot interface to take screenshot..............
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		// 1]capture full page Screenshot.......
		TakesScreenshot ts = (TakesScreenshot) driver; // we create variable here of TakeScreenshot interrface...and assign the driver instance....
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE); //// here we take screenshot into file type........
		File targetfile = new File("E:\\Testing JBK\\Screenshots\\ss2.png");
		
		// System.getProperty("user.dir") -------------------------> this line also return the path which before the ss storing folder............3
		// for eg. -----> File targetfile = new File( "System.getProperty("user.dir")"+"\\Screenshots\\ss2.png");
		
		
		sourcefile.renameTo(targetfile); /// .renameTo() method... copy sourcefile to targetfile....
		

		
	}

}
