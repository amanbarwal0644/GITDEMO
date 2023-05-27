import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class web_sorting_with_search_bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

	driver.findElement(By.id("search-field")).sendKeys("ato");
	
	List<WebElement> grabing = driver.findElements(By.xpath("//tr/td[1]"));
	
System.out.println("first"+grabing.size());

	List<String>grab_webElement_text = grabing.stream().map(S->S.getText()).filter(S->S.contains("ato")).collect(Collectors.toList());
	
	System.out.println("second"+grab_webElement_text.size());
	
	
	Assert.assertTrue(true);
	
	Assert.assertEquals(grabing.size(), grab_webElement_text.size()); 
	/*
	 * for(int i=0;i<grab_webElement_text.size();i++) {
	 * 
	 * 
	 * }
	 */
	
	}

}
