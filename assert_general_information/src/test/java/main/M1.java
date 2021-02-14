package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.P1;


public class M1 
{
	

	private WebDriver driver;

	@BeforeMethod
	public void beforeMethod()

	{
		System.setProperty("webdriver.chrome.driver", "/Users/madan mohan reddy/Desktop/selenium-java-3.141.59/chromedriver latest");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testzenlabs.ie/general-information-form/");
		
        
	}

	@Test
	public void generalInformationTest() throws InterruptedException 
	{
		P1.first_name(driver);
	
		Assert.assertEquals(P1.first_name_Validate(driver), true);
		
		///validating the text is correct or not
		
		
		P1.Middle_Name(driver);
		
        Assert.assertEquals(P1.Middle_Name_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.Last_Name(driver);
		
        Assert.assertEquals(P1.Last_Name_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.phone_number(driver);
		
		Assert.assertEquals(P1.phone_number_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.Address_One(driver);
		
		Assert.assertEquals(P1.Address_One_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.Address_Two(driver);
		
		Assert.assertEquals(P1.Address_Two_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.pin_code(driver);
		
		Assert.assertEquals(P1.pin_code_Validate(driver), true);
		
		///validating the text is correct or not
		
		
		P1.Male(driver);
		
		Assert.assertEquals(P1.Male_validate(driver), true);
		
		///validating the text is correct or not
		
		
		P1.Major(driver);
		
		Assert.assertEquals(P1.Major_validate(driver), true);
		
		///validating the text is correct or not
	
		P1.Formerly_Registered(driver);
		
		Assert.assertEquals(P1.Formerly_Registered_validate(driver), true);
		
		///validating the text is correct or not
		
        P1.continent(driver);
		
        Assert.assertEquals(P1.continent_Validate(driver), true);
        
		///validating the text is correct or not
		
		P1.choose_file(driver);
		
		Assert.assertEquals(P1.choose_file_validate(driver), true);
		
}

	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();

	}

}
