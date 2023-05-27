

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class Practice_directory_change {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		
		
		
		ChromeOptions options = new ChromeOptions();

		Map<String,Object> dot = new HashMap<String,Object>();

		dot.put("download.default_directory", "C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot");


		options.setExperimentalOption("prefs", dot);
		
		ChromeDriver driver = new ChromeDriver(options);
		
		SoftAssert a = new SoftAssert();
		
		
driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		
		driver.manage().window().maximize();
JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//a[text()='Download sample DOC file']")).click();
		
	
		
		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(image, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\test.png"));
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> URl = driver.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul/li/a"));
		
		
		for(int i=0 ;i<URl.size();i++) {
			
			String attri = URl.get(i).getAttribute("href");
		String text = 	URl.get(i).getText();
			HttpURLConnection conn = (HttpURLConnection)new URL(attri).openConnection();
			
			conn.setRequestMethod("HEAD");
			
			conn.connect();
		
			a.assertTrue(conn.getResponseCode()<400, attri+ "This is the link which is broken"+text);
			System.out.println(attri);
			System.out.println(conn.getResponseCode());
			
			
		}
		
		a.assertAll();
          
				
           
              
                
		
		
		
		
		
		
	}

}
