import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Window_scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		WebDriver  driver = new  ChromeDriver();
		// how to scroll a web page to a particular view
		
		//this is done javascript executor
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement location =driver.findElement(By.id("product"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	
		js.executeScript("arguments[0].scrollIntoView();",location);
		
		//now we want to scroll the module table  for that we need javascript to scroll
		
		
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
	List<WebElement> tabledata = 	driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		int sum=0;
	for(int k=0 ;k<tabledata.size();k++) {
		
		String lo = tabledata.get(k).getText();
		
		sum = sum + Integer.parseInt(lo);
	}

	
	System.out.println(sum);
	
	
String cLal = driver.findElement(By.className("totalAmount")).getText();

String[] aman= cLal.split(":");


String total_num= aman[1].trim(); 


Assert.assertEquals(Integer.parseInt(total_num), sum);




	}

}
