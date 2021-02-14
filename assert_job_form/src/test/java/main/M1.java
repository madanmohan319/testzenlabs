package main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.P1;

;


public class M1 

{
	private WebDriver driver;

	@BeforeMethod()

	public void before() 
	
	{
		System.setProperty("webdriver.chrome.driver", "/Users/madan mohan reddy/Desktop/selenium-java-3.141.59/chromedriver latest");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testzenlabs.ie/job-details-form/");
	}

	@Test()
	public void generalInformationTest() throws InterruptedException
	
	{

		P1.Previous_Company_Name(driver);
		
        Assert.assertEquals(P1.Previous_Company_Name_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.Current_Company_Name(driver);
		
		 Assert.assertEquals(P1.Current_Company_Name_Validate(driver), true);
			
			///validating the text is correct or not
		
		P1.bday_date(driver);
		
		 Assert.assertEquals(P1.bday_date_Validate(driver), true);
			
			///validating the text is correct or not
			
			P1.previous_Join_Date(driver);
			
			 Assert.assertEquals(P1.previous_Join_Date_Validate(driver), true);
				
				///validating the text is correct or not
				
				P1.Previous_Company_End_Date(driver);
				
				 Assert.assertEquals(P1.Previous_Company_End_Date_Validate(driver), true);
					
					///validating the text is correct or not
				
				P1.current_Company_Join_Date(driver);
				
				 Assert.assertEquals(P1.current_Company_Join_Date_Validate(driver), true);
					
					///validating the text is correct or not
			
		P1.Experience_CLICK(driver);
		
		 Assert.assertEquals(P1.Experience_CLICK_Validate(driver), true);
			
			///validating the text is correct or not
		 
		 P1.QA_Web_Manual(driver);
		 
		 Assert.assertEquals(P1.QA_Web_Manual_Validate(driver), true);
			
			///validating the text is correct or not
		 
		 P1.QA_submit(driver);
		 
		 Assert.assertEquals(P1.QA_submit_Validate(driver), true);
			
			///validating the text is correct or not

	}

	@AfterMethod
	public void afterMethod() 
	
	{
		driver.quit();

	}

}