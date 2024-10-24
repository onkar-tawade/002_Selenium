package _19Optionclass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class enableExtensionsAtRuntime {

	public static void main(String[] args) {

		/// Here we learn that how to enable extensions at runtime..... Steps for do this...
		/// 1. Install CRX extractor/Downloader to chrome browser...(manually)
		/// 2. Add SelectorHub plugin to chrome browser ...(manually)
		/// 3. Capture crx file for selectorHub extensions...
		/// 4. pass crx file path in automation script in ChromeOptions....
		
		ChromeOptions op = new ChromeOptions();///  create object of ChromeOptions classs.......
		
		File file1 = new File("E:\\Testing JBK\\Manual testing\\crx files\\SelectorsHub.crx" );/// create object of File class and pass the path of crx file with name 
		File file2 = new File("E:\\Testing JBK\\Manual testing\\crx files\\AdBlocker.crx");
		
		op.addExtensions(file1); /// use method .addExtensions and pass the file object....here attached the file...
		op.addExtensions(file2);
		WebDriver driver = new ChromeDriver(op);  //// here pass the ChromeOptions object to driver to apply the setting...
		
		driver.get("https://text-compare.com/");
		
		
		
	}

}
