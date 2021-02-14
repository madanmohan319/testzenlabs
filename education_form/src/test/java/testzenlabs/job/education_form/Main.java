package testzenlabs.job.education_form;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Static.Static;

public class Main {

	private WebDriver driver;

	@BeforeMethod()
	public void beforeMethod()

	{
		System.setProperty("webdriver.chrome.driver", "/Users/madan mohan reddy/Desktop/selenium-java-3.141.59/chromedriver latest");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testzenlabs.ie/education-form/");

	}

	@Test()
	public void test() throws InterruptedException

	{

		Static.Primary_School(driver);
		Static.Secondary_School(driver);
		Static.Intermediate(driver);
		Static.Engineering(driver);
		Static.University(driver);
		Static.intermediate_Percentage(driver);
		Static.MR(driver);

	}

	@AfterMethod()
	public void aftermethod() {
		driver.quit();
	}

}
