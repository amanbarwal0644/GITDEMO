import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Hello Checking if GITX user gets my chnages or not.
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
	// implicitely wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
		driver.findElement(By.xpath("//a[text()='Appium']"));
		WebElement first_div = driver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		
	
		
		
		 
		  
		for(int i=1;i<first_div.findElements(By.tagName("a")).size();i++)
			
		{
			
			String compo = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  
	     first_div.findElements(By.tagName("a")).get(i).sendKeys(compo);
	
        //explicitely wait implementations have 2 waits 
	     //first is through webdriver wait interface();
	     //second is fluent wait
	     
	    
	    
	    
	    
	    
	    
		
		}
		
		Set <String> child_window_id = driver.getWindowHandles();
		
		Iterator <String>it = child_window_id.iterator();
		
		String parent = it.next();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		while(it.hasNext()) {
			String child_id=it.next();
			
			driver.switchTo().window(child_id);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
		}
		
	
	}

	

}
