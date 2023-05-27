import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = 	(JavascriptExecutor)driver;
		WebElement location = driver.findElement(By.cssSelector("table[id='product']"));
		js.executeScript("arguments[0].scrollIntoView();",location );
		
		//js.executeScript("window.scrollby(0,5000)","" );

		
	List<WebElement>count = 	driver.findElements(By.cssSelector("table[id='product']:nth-child(2) tr"));
	System.out.println("No of rows in the table are"+count.size());
	
	
	
	List <WebElement>count2 = driver.findElements(By.cssSelector("table[id='product']:nth-child(2) td"));

	System.out.println("No of column in the table are"+count2.size());
	
List<WebElement> third_row = driver.findElements(By.cssSelector("table[id='product']:nth-child(2) tr:nth-child(4) td"));

for(int p=0;p<third_row.size();p++) {
	String data = third_row.get(p).getText();
	
	System.out.println(data);
}
	
	}

}
