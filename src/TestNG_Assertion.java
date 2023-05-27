import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestNG_Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Selenium_browser_driver\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Selenium_browser_driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
	
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		driver.findElement(By.xpath("//button[contains(@class,'reset')]")).click();
		String contain_password_st=driver.findElement(By.xpath("//form/p")).getText();
		
		String  grab_password = password_filter_from_statement(contain_password_st);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		

		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
		
		
		
		
	String name = "rahul";
		
		driver.findElement(By.cssSelector("input[id= 'inputUsername']")).sendKeys(name);		
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys(grab_password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//input[contains(@id,'chkboxT')]")).click();
		//driver.findElement(By.cssSelector("input[id*=chkboxT]")).click();
		driver.findElement(By.className("submit")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	    
	    Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+" "+name+",");
	
	    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	 
	}

	public static  String password_filter_from_statement(String contain_password_s) {
		
		
		String[] splitted_string =	contain_password_s.split("'");
		
		for(String k:splitted_string) {
			System.out.println(k);
		}
		 
		String grab_password = splitted_string[1];
		System.out.println(grab_password);
		
		return grab_password;
		

	}
	
}
