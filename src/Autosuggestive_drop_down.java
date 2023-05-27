import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestive_drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
	WebDriver driver = new 	ChromeDriver();
	
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//driver.findElement(By.id("autocomplete")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Actions obj = new Actions(driver);
	
	
	obj.moveToElement(driver.findElement(By.id("autocomplete"))).click().build().perform();
	obj.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys("Ind").build().perform();
	
	
	List<WebElement> listing = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	
	System.out.println(listing.size());
	
	for(WebElement x:listing)
	{
		if(x.getText().equals("India")) {
			
			
			
			System.out.println("im in");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			x.click();
			break;
		}
		else {
			System.out.println("entered data  not found yet");
		}
		
	}
	
	
	
	
		
	}

}
