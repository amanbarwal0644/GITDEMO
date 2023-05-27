import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Drop_downs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver" , "C:\\Users\\admin\\Selenium_browser_driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
		
		
		driver.manage().window().maximize();
		WebElement Aman = driver.findElement(
				By.xpath("//div[contains(@class,'currency')]/select[contains(@name,'ctl00$mainContent')]"));

		Select barwal = new Select(Aman);
		System.out.println(barwal.getFirstSelectedOption().getText());

		// driver.findElement(By.xpath("//div[contains(@class,'currency')]/select[contains(@name,'ctl00$mainContent')]")).click();

		barwal.selectByVisibleText("AED");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		barwal.selectByIndex(3);

		// ADD Adult/child/infant
		driver.findElement(By.id("divpaxinfo")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//// "//div[@id='divpaxOptions']/div[@id='divAdult']/following-sibling::div[@class='ad-row'][1]/div[@class='ad-row-left']/label[@class='guestlbl']"

		// WebElement region=
		// driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[@id='divAdult']/following-sibling::div[@class='ad-row'][1]"));

		// WebElement big_region =
		// driver.findElement(By.xpath("//div[@class='adult-popup']"));

		List<WebElement> aman = driver.findElements(By.xpath("//div[@class='ad-row']"));
		System.out.println(aman);
		// System.out.println(region);
		// System.out.println(big_region);

		for (int i = 0; i < 2; i++) {

			driver.findElement(By.id("hrefIncChd")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		driver.findElement(By.xpath("//div[@class='ad-row align-center']/input[@id='btnclosepaxoption']")).click();

		String scholl = driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText();
		System.out.println(scholl);

		driver.get("https://www.spicejet.com/");

		// select from city
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div[contains(@class,'css-1dbjc4n')]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][7]"))
				.click();
		System.out.println(driver.findElement(By.xpath(
				"//div[@data-testid='to-testID-origin'] //div[contains(@class,'css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep')]"))
				.getText());

		// select to city
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][9]"))
				.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(driver.findElement(By.xpath(
				"//div[@data-testid='to-testID-destination'] //div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"))
				.getText());
		// "//div[@data-testid='to-testID-destination']/div[@class='css-1dbjc4n
		// r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5
		// r-tju18j r-5njf8e r-1otgn73']"

		driver.navigate().back();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		List<WebElement> AutoList;

		try {
			Thread.sleep(2000);
			AutoList = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

			/*
			 * for(WebElement container: AutoList) { String Barwal = container.getText();
			 * System.out.println(Barwal); }
			 */

			for (WebElement Singlewebelement : AutoList) {
				System.out.println(Singlewebelement.getText());

				if (Singlewebelement.getText().equalsIgnoreCase("India")) {
					Singlewebelement.click();

					try {
						Thread.sleep(3000);
						System.out.println(driver.findElement(By.id("autosuggest")));
						break;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// count number of checkboxes in that page.

		List<WebElement> checkboxesnames = driver
				.findElements(By.xpath("//input[contains(@id,'ctl00_mainContent_chk')]/following-sibling::label"));

		for (int i = 1; i < checkboxesnames.size(); i++) {

			// for()
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

			// int number = ;
			System.out.println("Checkbox name is " + checkboxesnames.get(i).getText() + "Response "
					+ checkboxes.get(i).isSelected());
			// Assert.assertTrue(checkboxes.get(i).isSelected(), "please select the check
			// box number"+" :- "+i);
			try {
				Thread.sleep(2000);
				if (!checkboxes.get(i).isSelected()) {

					checkboxes.get(i).click();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));

		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));

		if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")) {
			System.out.println("web element is enabled");

		} else {
			System.out.println("Webelement is disbaled");
		}

		// handling java alerts.Selenium can handle html but these alerts are javascript
		// so to handle those there
		// is a mechanism.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Aman");
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	//adding product to cart
		
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		/* driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); */
		String test = "Brocolli";
		//String search = "Cauliflower";
		
		String[] Item_i_need = {"Beetroot","Cauliflower","Brocolli","Beetroot","Potato","Strawberry"};
	//	"Cauliflower","Brocolli","Beetroot","Tomato"
		List<WebElement> Webpage_products_list = driver.findElements(By.cssSelector("h4[class='product-name']"));
		/*
		 * int i=0; for(WebElement product_List : products_list) {
		 * if(product_List.getText().equals("Cauliflower - 1 Kg")){
		 * 
		 * System.out.println("i am able to found that product");
		 * product_List.findElement(By.xpath(("(//button[@type='button'])[i]"))).click()
		 * ; break;
		 * 
		 * }else { i++;
		 * 
		 * System.out.println("not able to found the product");
		 * 
		 * } }
		 */
		
		// Adding to cart more optimized way
		
		//?
		
		
	/*	for (int j=0;j<search.length;j++) {
			String itemNeeded = search[j];
		
		
		for(int i=0;i<products_list.size();i++) {
			if(products_list.get(i).getText().contains(itemNeeded)) {
				
				
				
				
				System.out.println(products_list.get(i).getText()+ "index is"+i);
				
				
			try {
				Thread.sleep(5000);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
			}else {
				System.out.println("product not found");
			}
		}
	
	}
		*/
		//????
		
	//* What if we dont have contains method then whole item name with -1kg will come and that will not mtach with our 
	 //* inputed items. So for that there is concept of converting array to Array list.
	 //*Adding items to cart by converting Array to ArrayList.
	 //*	/
		
		
	 
		
		// Array to ArrayList because it has  a method by which it ease the work.
		
		List arrayList =Arrays.asList(Item_i_need);
	
		for(int i=0; i<Webpage_products_list.size();i++)
		{
			String Webpage_Single_Item_webelement =	driver.findElements(By.cssSelector("h4[class='product-name']")).get(i).getText();
			
			String[] Webpage_Single_Item_webelement_breakup = Webpage_Single_Item_webelement.split("-");
			
			String nameformat=Webpage_Single_Item_webelement_breakup[0].trim();
			
			System.out.println(nameformat);
			System.out.println(arrayList);
		if(arrayList.contains(nameformat))
			
		    {
			try {
				Thread.sleep(6000);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		        
		        System.out.println("item found at "+ i + "index");
		        
		        for(int j=0;j<Item_i_need.length;j++) {
		        	
		        	break;
		        }
		        
		        
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("at this index "+ i + " nothing is found in itemnedded arraylist ");
				
				
				e.printStackTrace();
			}
			
			
		
		        
		      
		        
		     }
		
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// Defining explicitly wait.there are two methods of defining it.
		/*
		 * frist method is to create webdriverwait() class obj.Selenium people created
		 * this class so that we can use methods inside that. Syntax of explicitly wait
		 * is 
		 * WebDriverWait object = new WebDriverWait(pass your driver here , time of wait in seconds)
		 * object.until(condition,Duration.of seconds(4))
		 */
		
		
		
		
		
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		WebDriverWait object = new WebDriverWait(driver,Duration.ofSeconds(6));
		object.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("p[class*='text-center']")).getText().split(test);
		
		
		
		
		
		
	}

}
