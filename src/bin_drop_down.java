import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class bin_drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//First method to shift control directly to child from parent without processing intermediate childs
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//second method to get access to another element when multiple elemnts are there and you want to select apart from first
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		driver.findElement(By.id("autosuggest")).sendKeys("and");
		
		List<WebElement> options=driver.findElements(By.xpath("//body/ul[@id='ui-id-1']"));
		
		for(WebElement option : options) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("Cayman Island")) {
				option.click();
			break;
			}
		}
	
System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());

Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
	System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
	
	Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
	
	
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	int count = 0;
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	for(WebElement checkbox : checkboxes) {
		//String name_of_checkbox=checkbox.getAttribute("");
		
		//System.out.println(name_of_checkbox);
		count++;
	}
	System.out.println("total number of checkboxes in this webpage are"+count);

	
	
	
	
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
	
	if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
		System.out.println("web element is enabled");
	}
	else {
		System.out.println("web element is disabled");
	}
	
	driver.findElement(By.id("Div1")).click();
	if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
		System.out.println("web element is enabled");
		
		Assert.assertTrue(true);
	}
	else {
		System.out.println("web element is disabled");
		Assert.assertTrue(false);
	}
	
	
	}

}
