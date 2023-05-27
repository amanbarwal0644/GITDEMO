import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_dynamic_selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
/*		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.id("checkBoxOption2")).click();
		
	String checkbox_text =	driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement drop_location = driver.findElement(By.id("dropdown-class-example"));
		Select  obj =  new Select(drop_location);
		obj.selectByVisibleText(checkbox_text);
		
		driver.findElement(By.id("name")).sendKeys(checkbox_text);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alert_message = driver.switchTo().alert().getText();
		
		
	
		
		driver.switchTo().alert().accept();
		
		if(alert_message.contains(checkbox_text)) {
			System.out.print("yes grabed text is present in the alert messsage");
		}
		
	
	*/
	driver.get("https://www.path2usa.com/travel-companion/");
	driver.manage().window().maximize();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	// Scroll the Page

JavascriptExecutor js = (JavascriptExecutor)driver;

//Scrolling down the page till the element is found		


	
	WebElement location = driver.findElement(By.className("elementor-field-label"));
	
	js.executeScript("arguments[0].scrollIntoView();", location);
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.findElement(By.id("form-field-travel_comp_date")).click();
	
	
	String month = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
	
	
	//System.out.println(driver.findElement(By.xpath("//span[@class='cur-month']")).getText());
	System.out.print(month);
	       
		while(!month.equals("May"))
			 {
			 
			
			 driver.findElement(By.xpath("//Span[@class='flatpickr-next-month']")).click();
			 
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
			 month = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
			 System.out.println(month);
			 
			 
			
			
		
		}
		
		
			
		
	
	
	
	
	
	}

}
