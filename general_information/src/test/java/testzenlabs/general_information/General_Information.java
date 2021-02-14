package testzenlabs.general_information;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Static_pages.General_information_pom;

public class General_Information 
{
	

	private WebDriver driver;

	@BeforeMethod
	public void beforeMethod()

	{
		 
		System.setProperty("webdriver.chrome.driver", "/Users/madan mohan reddy/Desktop/selenium-java-3.141.59/chromedriver");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testzenlabs.ie/general-information-form/");
		
        
	}

	@Test
	public void generalInformationTest() throws InterruptedException 
	{
		General_information_pom.first_name(driver);
		
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Name']"));

		Assert.assertEquals(element1.getAttribute("value"), "madan");
		///validating the text is correct or not
		
		
		General_information_pom.Middle_Name(driver);
		
		Thread.sleep(2000);
		
		
		General_information_pom.Last_Name(driver);
        
		Thread.sleep(2000);
		
		General_information_pom.phone_number(driver);
		
		General_information_pom.Address_One(driver);
		
		General_information_pom.Address_Two(driver);
		
		General_information_pom.pin_code(driver);
		
		General_information_pom.continent(driver);
		
		
		General_information_pom.choose_file(driver);
	
		Thread.sleep(7000);
		
		General_information_pom.Switch(driver);
		
		General_information_pom.service(driver);
		
		
	}

	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();

	}

}
