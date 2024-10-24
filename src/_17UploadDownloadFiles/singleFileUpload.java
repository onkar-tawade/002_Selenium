package _17UploadDownloadFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleFileUpload {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		
		/// single file upload.......
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("E:\\Testing JBK\\Manual testing\\1subAndadd Test cases.xlsx");
//		
//		 String filename = driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
//          
//		 if (filename.equals("1subAndadd Test cases.xlsx")) {
//			System.out.println("File uploaded successfully....");
//		}
//		 else {
//				System.out.println("File not uploaded....");
//
//		}
		 

			/// Multiple files  upload.......
            /// If you want  to pass multiple files then we using strings...& thats strings pass in .sendKeys()
		
		String file1="E:\\Testing JBK\\Manual testing\\3test case 1.xlsx";
		String file2="E:\\Testing JBK\\Manual testing\\4Test case 2.xlsx";
		String file3="E:\\Testing JBK\\Manual testing\\5Transaction Testcases.xlsx";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2+"\n"+file3);

		List<WebElement> allFiles= driver.findElements(By.xpath("//ul[@id='fileList']//li"));
		System.out.println(allFiles.size());
		
		for (WebElement files : allFiles) {
			System.out.println(files.getText());
		}
		
	}

}
