import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
	List<WebElement>element = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	
	List<String> veg_price = element.stream().filter(S->S.getText().contains("Rice")).map(S->getvegprice(S)).collect(Collectors.toList());
	
	veg_price.stream().forEach(S->System.out.println(S));
	
	}

	private static String getvegprice(WebElement S) {
		// TODO Auto-generated method stub
	
		
	String price = 	S.findElement(By.xpath("following-sibling::td[1]")).getText();
	return price;
	}

}
