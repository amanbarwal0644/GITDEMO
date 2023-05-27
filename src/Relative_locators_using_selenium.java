import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative_locators_using_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		 WebElement editbox = driver.findElement(By.className("form-control ng-untouched ng-pristine ng-invalid"));
		 
		 // now we are using relative locators
		 
		System.out.println( driver.findElement(with(By.tagName("label")).above(editbox)).getText());
		 
		
		 
		
	}

}
