import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class locator_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Selenium_browser_driver\\geckodriver.exe");
		
	//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Selenium_browser_driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		String Username = "rahul";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(Username);
		driver.findElement(By.name("inputPassword")).sendKeys("hello");
		//driver.findElement(By.className("submit")).click();
		
		
		//driver.findElement(By.cssSelector("Button.submit")).click();
		
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		
	/*	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		System.out.println(driver.findElement(By.className("error")).getText());
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("john");
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("amanbarwal.ab@gmail.com");
		//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("7986073175");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8725845774");
		
		
	//	driver.findElement(By.xpath("//Button[@class='reset-pwd-btn']")).click();
		driver.findElement(By.xpath("//Button[contains(@class,'reset')]")).click();
		
		
		
		System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
		
		
		
String[] password = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText().split("'");
	
	driver.findElement(By.xpath("//button[contains(@class,'go-to')]")).click();
for (int j = 0;j<password.length;j++) {
		password[j].trim();
	System.out.println(password[j]);
	}
	
	
	for (int i = 0;i<password.length;i++) {
		String A=password[i].trim();
		System.out.println(A);
		if(A.equalsIgnoreCase("rahulshettyacademy")) {
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(A);
			driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys("rahul");
			break;
		}
		else {
			System.out.println("password retriveal failed from text");
		}
	}
	
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	/*
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(Username);
	
	driver.findElement(By.xpath("//form/input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
	
	*/
	driver.findElement(By.cssSelector("#chkboxOne")).click();
	driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.tagName("p")).getText();
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+Username+",");
	
		
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
	}

}
