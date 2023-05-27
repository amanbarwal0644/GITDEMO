import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@class='cart-header-navlink'][1]")).click();
		
	List<WebElement> elements = 	driver.findElements(By.xpath("//tbody/tr/td[1]"));
	

	List<WebElement> elemnts2 = driver.findElements(By.cssSelector("td:nth-child(1)"));
	
	System.out.println(elemnts2.size());
	
	List<String> unsorted_original  = elemnts2.stream().map(S->S.getText()).collect(Collectors.toList());
	
	unsorted_original.forEach(S->System.out.println(S));
	
	List<String>sorted_list = unsorted_original.stream().sorted().collect(Collectors.toList());
	
	Assert.assertFalse(unsorted_original.equals(sorted_list));
	
	
	 List<String> tooth = elemnts2.stream().filter(S->S.getText().contains("Rice")).map(S->getVegie(S)).collect(Collectors.toList());
	 
	 
	 
	 tooth.forEach(S->System.out.println(S));
	 
	
	
	
	
	
	
	
		}

	private static String getVegie(WebElement s) {
		// TODO Auto-generated method stub
		
		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}
	
	

}

