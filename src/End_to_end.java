import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Selenium_browser_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement locator = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 
		 
		 System.out.println(locator);
		
		 driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		 
		Select dropdown_method = new Select(locator);
		
		
		dropdown_method.selectByIndex(1);
		
		
		System.out.println(dropdown_method.getFirstSelectedOption().getText());
		
		dropdown_method.selectByVisibleText("AED");
		
		
		System.out.println(dropdown_method.getFirstSelectedOption().getText());
		
		dropdown_method.selectByValue("USD");
		
		System.out.println(dropdown_method.getFirstSelectedOption().getText());
		
		
		driver.findElement(By.xpath("//*[@id = 'divpaxinfo']")).click();
		int count = 0;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i=5;
		do {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		while(i<5); 
		
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();


List<WebElement> from_opts=driver.findElements(By.xpath("//td[@class='mapbg'] //a"));
		
for(WebElement opt : from_opts) {
	System.out.println(opt.getText());
	
	if(opt.getText().equalsIgnoreCase("Bengaluru (BLR)")){
		opt.click();
		break;
	}
}

	//	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
          driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
			
      //parent tag[@att='vvalue'][2]"
       
	driver.findElement(By.id("autosuggest")).sendKeys("ho");
		
List<WebElement> auto_opt_list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));	

	for (WebElement auto_opt : auto_opt_list) {
		System.out.println(auto_opt.getText());
		if(auto_opt.getText().equalsIgnoreCase("Lesotho")) {
			auto_opt.click();
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
	//int count = 0;
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	for(WebElement checkbox : checkboxes) {
		//String name_of_checkbox=checkbox.getAttribute("");
		
		//System.out.println(name_of_checkbox);
		//count++;
	}
	//System.out.println("total number of checkboxes in this webpage are"+count);

	
	
	
	
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
