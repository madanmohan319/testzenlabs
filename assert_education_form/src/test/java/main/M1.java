
package main;

import org.testng.annotations.Test;


import test.P1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class M1 {

	private WebDriver driver;
	
	private  void scroll() 
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
		
	}

	@BeforeMethod()
	public void beforeMethod()

	{
		System.setProperty("webdriver.chrome.driver", "/Users/madan mohan reddy/Desktop/selenium-java-3.141.59/chromedriver");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testzenlabs.ie/education-form/");

	}
	
	@Test()
	public void test() throws InterruptedException

{
		

		P1.Primary_School(driver);
		
		
		Assert.assertEquals(P1.Primary_School_Validate(driver), true);
		
		
		///validating the text is correct or not
		
		
		P1.Secondary_School(driver);
	
		Assert.assertEquals(P1.Secondary_School_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.Intermediate(driver);
		Assert.assertEquals(P1.Intermediate_Validate(driver), true);
		
		///validating the text is correct or not
		
		P1.Engineering(driver);
		
		Assert.assertEquals(P1.Engineering_Validate(driver), true);
		
		///validating the text is correct or not

		P1.University(driver);
	
		Assert.assertEquals(P1.University_Validate(driver), true);
		
		///validating the text is correct or not
		
		
		P1.intermediate_Percentage(driver);
		
      Assert.assertEquals(P1.intermediate_Percentage_Validate(driver), true);
      
      Thread.sleep(3000);
		
        P1.Engineering_Percentage(driver);
		
		Assert.assertEquals(P1.Engineering_Percentage_Validate(driver), true);
		
 P1.University_Percentage(driver);
 Assert.assertEquals(P1.University_Percentage_Validate(driver), true);
 
 P1.MR(driver);
   
 Assert.assertEquals(P1.MR_Validate(driver), true);
	///validating the text is correct or not
 
 P1.range_1(driver);
	
	Assert.assertEquals(P1.range_1_Validate(driver), true);
	
	P1.range_2(driver);
	
	Assert.assertEquals(P1.range_2_Validate(driver), true);
	
	P1.range_3(driver);
	Assert.assertEquals(P1.range_3_Validate(driver), true);
	
P1.education(driver);

Assert.assertEquals(P1.education_Validate(driver), true);
/////validating the text is correct or not


	}

	@AfterMethod()
	public void aftermethod() {
		driver.quit();
	}

}
