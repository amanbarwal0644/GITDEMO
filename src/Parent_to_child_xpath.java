import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parent_to_child_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Selenium_browser_driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Selenium_browser_driver\\msedgedriver.exe");
	//	WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		//absolute x-path it starts from the very first html tag. not from the mid
		
		
		
		driver.manage().window().maximize();
	//	System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[1]")).getText());
		
//		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		
	//	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		
	//	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText());
		
		
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	try {
		Thread.sleep(15000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	driver.navigate().back();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.navigate().forward();
	
	
	}

}
