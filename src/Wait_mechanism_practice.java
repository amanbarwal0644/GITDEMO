import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_mechanism_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		
	String Username = 	driver.findElement(By.xpath("//p[contains(@class,'text-center')]/b[1]")).getText();
	
	String Password = 	driver.findElement(By.xpath("//p[contains(@class,'text-center')]/b[2]")).getText();
		
	driver.findElement(By.id("username")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.xpath("(//label[@class='customradio']/span[@class='checkmark'])[2]")).click();
	
	WebDriverWait wait_obj = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait_obj.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));

	System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']/p")).getText());
	driver.findElement(By.id("okayBtn")).click();
	
	/* this is not a javascript alert so this will not come in use here.
	 * String alert_text = driver.switchTo().alert().getText();
	 * System.out.println(alert_text);
	 * 
	 * driver.switchTo().alert().accept();
	 */
	WebElement drop_location=  driver.findElement(By.xpath("//select[@class='form-control']"));
	Select obj2 = new Select(drop_location);
	
	obj2.selectByVisibleText("Consultant");
	
	driver.findElement(By.name("terms")).click();
	
	driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	
	List <WebElement> Product_list = driver.findElements(By.cssSelector("h4[class='card-title']"));
	
	for(int i=0;i<Product_list.size();i++)
	{
		System.out.println(Product_list.get(i).getText());
		
		driver.findElements(By.xpath("//button[contains(@class,'btn')]")).get(i).click();

		
	}
	
	
	driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]")).click();
	
	driver.get("https://the-internet.herokuapp.com/dynamic_loading");
	
	
	driver.findElement(By.partialLinkText("Example 1: Element on page that is hidden")).click();
	
	driver.findElement(By.cssSelector("Div[id='start'] button")).click();
	
	
	//fluent wait implementation
	
	
Wait <WebDriver> wait_object = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

WebElement foo = wait_object.until(new Function <WebDriver,WebElement>() {
	
	public WebElement apply(WebDriver driver){
		
		
		
		if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
			
			return driver.findElement(By.cssSelector("div[id='finish'] h4"));
			
		}
		else {
			return null;
		}
		

		
	}
	
	
}

);
	

System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());


driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

Actions action_class_object = new Actions(driver);

action_class_object.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();



action_class_object.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("refrigerator")
.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();

WebElement move = driver.findElement(By.id("twotabsearchtextbox"));

/*
 * WebDriverWait wait_for_sometime = new
 * WebDriverWait(driver,Duration.ofSeconds(5));
 * 
 * wait_for_sometime.until(ExpectedConditions.invisibilityOf(move));
 */
action_class_object.contextClick(move).build().perform();




// Topic :- How to Handle frames

driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.cssSelector(".blinkingText")).click();

/*
 * Set<String> WindowsId = driver.getWindowHandles(); //[parent id,child id]
 * 
 * System.out.println(WindowsId);
 * 
 * Iterator<String> it = WindowsId.iterator();
 * 
 * System.out.println("iterator output"+it);
 * 
 * String parent=it.next();
 * 
 * System.out.println("parentid"+parent);
 * 
 * String child = it.next(); driver.switchTo().window(child);
 * System.out.println(driver.getTitle());
 * 
 * System.out.println(driver.getCurrentUrl());
 */



/*
 * driver.navigate().to("https://www.udemy.com/");
 * driver.findElement(By.xpath("//span[text()='Udemy Business']")).click();
 */ 
  Set<String> windows_id = driver.getWindowHandles();
  
  Iterator<String> position = windows_id.iterator();
  
  String parent = position.next();
  
  String child = position.next();
  
  // now on base of id we need to switch control to those id's
  
  driver.switchTo().window(parent);
  
  System.out.println(driver.getCurrentUrl());
  
  System.out.println(driver.getTitle());
  
  driver.switchTo().window(child);
  
  System.out.println(driver.getCurrentUrl());
  
  System.out.println(driver.getTitle());
  
 System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
 
 String Email_id = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
 
 driver.switchTo().window(parent);
 
 driver.findElement(By.cssSelector("input[id='username']")).sendKeys(Email_id);
 
 driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.xpath("(//label[@class='customradio']/span[@class='checkmark'])[2]")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".btn.btn-success"))));
	
	driver.findElement(By.id("okayBtn")).click();
	
	
	/*
	 * WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
	 * 
	 * wait2.until(ExpectedConditions.invisibilityOf(driver.findElement(By.
	 * cssSelector(".form-control"))));
	 */
	
	WebElement form_location = driver.findElement(By.cssSelector("select[class='form-control']"));
	Select drop_down_selection = new Select(form_location);
	
	
	
	drop_down_selection.selectByValue("consult");
	
	driver.findElement(By.id("terms")).click();
	
	driver.findElement(By.id("signInBtn")).click();
	
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
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
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	Set <String> id = driver.getWindowHandles();
	
	Iterator <String> pos = id.iterator();
	
	String pp_id = pos.next();
	
	String chi_id = pos.next();
	
	driver.switchTo().window(chi_id);
	
	System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText())	;
	
	/*
	 * try { Thread.sleep(8000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * driver.switchTo().window(pp_id);
	 * 
	 * try { Thread.sleep(8000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * System.out.println(driver.findElement(By.
	 * cssSelector("div[class='example'] h3")).getText()) ;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */ 
 


}
}
