package timesheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirstClassSeleniumMay9 {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
		
	driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}
		else{
			System.out.println("invalid browse");
		}
	  //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.get("https://demoqa.com/text-box");
	 // Thread.sleep(3000);
	// driver.findElement(By.name("username")).sendKeys("roohi123");
	
	//driver.findElement(By.id("userName")).sendKeys("roohi234");
		
	  //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 // Thread.sleep(3000);
	//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	 // driver.findElement(By.partialLinkText("OrangeHRM,"));
	
	//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Roohi123");
  //  driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input")).sendKeys("Roohi123");

		//driver.get("https://demoqa.com/text-box");
		//driver.findElement(By.tagName("input")).sendKeys("roohi123");
		//driver.get("https://demoqa.com/text-box");
	//	Thread.sleep(2000);
		//creating the variable userName because because find element methods returns the web element.
		// WebElement userName = driver.findElement(By.id("userName"));
		// userName.click();
		// userName.sendKeys("roohi456");
		 //userName.clear();
		// driver.get("https://demoqa.com/links");
		//	Thread.sleep(2000);
		//List<WebElement>alllinkfrompage = driver.findElements(By.tagName("a"));
		//System.out.println(alllinkfrompage.size());
		
		// driver.get("https://demoqa.com/text-box");
			//Thread.sleep(2000);
			//	WebElement userName =driver.findElement(By.id("userName"));
			//userName.sendKeys("Creekside");
			//WebElement userName =driver.findElement(By.id("currentAddress"));
		//	Thread.sleep(2000);
		//	userName.click();
		//	WebElement userName =driver.findElement(By.id("userName"));
		//	System.out.println(userName.isDisplayed());
		 
		// driver.get("https://demoqa.com/radio-button");
		//	Thread.sleep(2000);
		//WebElement noRadio =dsriver.findElement(By.id("noRadio"));
		//System.out.println(noRadio.isEnabled());
			
		driver.get("https://demoqa.com/radio-button");
			Thread.sleep(2000);
	WebElement yesRadio =driver.findElement(By.id("yesRadio"));
	driver.findElement(By.xpath("") );
		//yesRadio.click();
		Thread.sleep(2000);
		System.out.println(yesRadio.isSelected());
		
		//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//	Thread.sleep(3000);
	//	driver.findElement(By.name("username")).sendKeys("Admin");
	//	driver.findElement(By.name("password")).sendKeys("admin123");
	//	driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
			
			
			
}

}

	


