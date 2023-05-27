import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	//	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/ ");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		driver.navigate().back();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().forward();
		driver.navigate().back();
		
	}

}
