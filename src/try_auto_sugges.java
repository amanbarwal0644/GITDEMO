import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class try_auto_sugges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("and");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete ui-front ui-menu ui-widget ui-widget-content')]/li"));
		
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("Cayman Islands")) {
				option.click();
			}
		}
		
	}

}
