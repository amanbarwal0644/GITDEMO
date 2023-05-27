import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29096110#questions/15112348");
	
	}
	
	

}