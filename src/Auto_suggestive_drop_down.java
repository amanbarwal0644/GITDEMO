import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_suggestive_drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Selenium_browser_driver\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		
		
		
		List<WebElement> options =driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete ui-front ui-menu ui')]/li"));
		
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("AUSTRALIA")){
				option.click();
				break;
			}
			
		}
		
		
		
	}

}
