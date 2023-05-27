import java.io.File;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class path_change  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		  
		ChromeOptions options = new ChromeOptions();

		Map<String,Object> dot = new HashMap<String,Object>();

		dot.put("download.default_directory", "C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot");


		options.setExperimentalOption("prefs", dot);
				

		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");

		driver.manage().window().maximize();
		
		
		File takescreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(takescreen, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\total.png"));
		
		
		
		WebElement location = driver.findElement(By.cssSelector("tr[class='odd'] td:nth-child(5) a:nth-child(1)"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,550)", "");
		// js.executeScript("arguments[0].scrollIntoView();",location);

		driver.findElement(By.xpath("//a[text()='Download sample DOC file']")).click();

		// Step1 default downloading of the browser can be changed via Hashmap class
		// methods.
		/*
		 * Map<String,Object> destination_download_path = new HashMap <String,Object>();
		 * destination_download_path.put("download.default_directory",
		 * "C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot");
		 * 
		 * ChromeOptions behaviour = new ChromeOptions();
		 * 
		 * behaviour.setExperimentalOption("prefs",destination_download_path );
		 */
		/*
		 * ChromeOptions behaviour = new ChromeOptions();
		 * 
		 * Map<String, Object> dot = new HashMap<String, Object>();
		 * 
		 * dot.put("download.default_directory",
		 * "C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot");
		 * 
		 * behaviour.setExperimentalOption("prefs", dot);
		 */
		  
		  
		
		 
	}

}
