import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.partialLinkText("Click Here")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='example'] h3")));
		
		
		
		Set <String> id = driver.getWindowHandles();
		
		Iterator <String> pos = id.iterator();
		
		String pp_id = pos.next();
		
		String chi_id = pos.next();
		
		driver.switchTo().window(chi_id);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText())	;
		
		
	
		
		  
		  driver.switchTo().window(pp_id);
		  
		  WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='example'] h3")));
			
		  
		  System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText()) ;
		  
		  
		  driver.get("https://jqueryui.com/droppable/");
		  
		  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		  
		driver.findElement(By.cssSelector("#draggable")).click();
		
		Actions A1 = new Actions(driver);
		
		A1.dragAndDrop(driver.findElement(By.cssSelector("#draggable")), driver.findElement(By.id("droppable"))).build().perform();
		  
		  
	 
driver.switchTo().defaultContent();

driver.findElement(By.partialLinkText("Accept")).click();



driver.navigate().to("https://the-internet.herokuapp.com/");


driver.findElement(By.partialLinkText("Nested Frames")).click();
driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));


System.out.println(driver.findElements(By.tagName("frame")).size());

driver.switchTo().frame(1);

System.out.println(driver.findElement(By.id("content")).getText());


driver.get("https://rahulshettyacademy.com/AutomationPractice/");

System.out.println(driver.findElements(By.tagName("a")).size());

// limitizing the driver scope 

WebElement footer =  driver.findElement(By.id("gf-BIG"));
System.out.println(footer.findElements(By.tagName("a")).size());


//WebElement first_section = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));



List<WebElement> footer_first_sec_links = driver.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li"));

Actions obb =  new Actions(driver);


//for(int i=0;i<footer_first_sec_links.size();i++)
//{
	
	obb.moveToElement(driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul/li[1]"))).click().build().perform();
	


	
//}





	}

}
