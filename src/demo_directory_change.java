
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

import org.apache.commons.io.FileUtils;

public class demo_directory_change {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		//behaviour.addExtensions(null);   
		
		// How to set proxy 
		
/*		Proxy proxy_object = new Proxy();
		
		proxy_object.setHttpProxy("fill ip address:116.215.545");
		
		behaviour.setCapability("proxy", "proxy_object");
		
	*/	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		

		
		/*
		 * Map<String,Object> New_download_path = new HashMap<String,Object>();
		 * 
		 * New_download_path.put("C:\\Users\\admin\\Downloads",
		 * "C:\\Users\\admin\\OneDrive\\Desktop\\download material from selenium");
		 */
		
		ChromeOptions options = new ChromeOptions();

		Map<String,Object> dot = new HashMap<String,Object>();

		dot.put("download.default_directory", "C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot");


		options.setExperimentalOption("prefs", dot);
		
		
		// how to handle insecure certificates
		/*
		 * options.setAcceptInsecureCerts(true);
		 * 
		 * options.setExperimentalOption("prefs", "New_download_path");
		 */
		
		
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		
		driver.manage().window().maximize();
	WebElement location = 	driver.findElement(By.cssSelector("tr[class='odd'] td:nth-child(5) a:nth-child(1)"));
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,550)", "");
	//	js.executeScript("arguments[0].scrollIntoView();",location);
		
		driver.findElement(By.xpath("//a[text()='Download sample DOC file']")).click();
		
		
		/*
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src,new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\Aman.png"));
		
		//to scroll window by pixels so we can use for that
		
		//js.executeScript("window.scrollby(0,550)", "");
		//js.executescript("arguments[0];",location);
		//to set proxy, block pop-up, ssl cetrificates we need chromeoptions class.
		
		
		
		
		
		driver.get("https://www.postman.com/downloads/");
		
	File capture  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(capture, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\Aman123.png"));
	
		
		// to set download directory we need to use Has map class
		
		
		
		
		/*
		 * driver.manage().deleteAllCookies(); driver.manage().addCookie(null);
		 * driver.manage().deleteCookieNamed(null);
		 */
	
	
	/*
	driver.get("https://www.amazon.in/");
	
	File store_karo_isme = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(store_karo_isme, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\Barwal.png"));
	*/
	
	
	//To download to a specific directory
	
	//Step 1  declare object for hashmap class method id used to change default directory 
	
	//Map<String, object> obj = new HashMap<String, object>();
	
	
	//Map<String, Object> dot = new HashMap<String, Object>();
	
	
	}

}
