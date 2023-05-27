import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_Dropdowns {

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
		
/*		
		for(int i =0 ;i<3;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		count+=1;
		}
	System.out.println(driver.findElement(By.xpath("//*[@id = 'divpaxinfo']")).getText());
		
		
	*/	
		int i=5;
		do {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		while(i<5); 
		
		
		  //driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BLR']"));
			
		  
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
          driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));
		//driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
			
      //parent tag[@att='vvalue'][2]"
		
	}

}
