import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sibling_to_sibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	String Button_title=	driver.findElement(By.xpath("//header[@class='jumbotron text-center header_style']/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(Button_title);
		
		
		String XpathRegularExpression = driver.findElement(By.xpath("//header[contains(@class,'jumbotron ')]/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(XpathRegularExpression);
	}

}
