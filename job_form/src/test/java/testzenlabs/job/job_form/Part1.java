package testzenlabs.job.job_form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import job_part2.Part2;

public class Part1 

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

		Part2.Previous_Company_Name(driver);
		
	    Part2.Current_Company_Name(driver);
	    
		Part2.bday_Name(driver);
	
		Part2.previous_Join_Date(driver);
		
		Part2.Previous_Company_End_Date(driver);
	
		Part2.current_Company_Join_Date(driver);
		
		Part2.Experience_CLICK(driver);
		
		Part2.QA_Web_Manual(driver);
		
		Part2.QA_submit(driver);

	}

	@AfterMethod
	public void afterMethod() 
	
	{
		driver.quit();

	}

}
