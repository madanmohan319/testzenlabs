package Static_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class General_information_pom {

	public static void first_name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Name']"));

		element1.sendKeys("madan");

		Thread.sleep(2000);

	}

	public static void Middle_Name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Middle Name']"));

		element1.sendKeys("mohan");

		Thread.sleep(2000);

	}

	public static void Last_Name(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Last Name']"));

		element1.sendKeys("reddy");

		Thread.sleep(2000);

	}

	public static void phone_number(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Phone Number']"));

		element1.sendKeys("0899679102");

		Thread.sleep(2000);

	}

	public static void Address_One(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Address']"));

		Thread.sleep(2000);

		element1.sendKeys("Flat no 2, kingsmill court");

		Thread.sleep(2000);
	}

	public static void Address_Two(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Address Two']"));

		Thread.sleep(2000);

		element1.sendKeys("bolton street");

		Thread.sleep(2000);
	}

	public static void pin_code(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Pin Code']"));

		Thread.sleep(2000);

		element1.sendKeys("D01N520");

		Thread.sleep(2000);
	}
	public static void choose_file(WebDriver driver) throws InterruptedException
	
	{
		
		WebElement element1 = driver.findElement(By.id("photo"));
		Thread.sleep(2000);
		element1.sendKeys("/Users/madan mohan reddy/Desktop/123.jpg");
        Thread.sleep(2000);
		
		
	}

	

	public static void continent(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Asia']"));

		element1.sendKeys("Europe");

		Thread.sleep(2000);

	}

	public static void Switch(WebDriver driver) throws InterruptedException

	{
		WebElement element = driver.findElement(By.linkText("Switch To (Education Form)"));

		Thread.sleep(2000);

		String winhandlebefore = driver.getWindowHandle();

		element.click();

		Thread.sleep(2000);
		// switch to new window opened

		// enhanced for loop
		for (String winHandle : driver.getWindowHandles())

		{
			driver.switchTo().window(winHandle);
		}
		// perform the actions on new windows

		{
			WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Primary School Name']"));

			element1.sendKeys("model mission high school");

			Thread.sleep(3000);

		}

		{
			WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Secondary School Name']"));

			element1.sendKeys("model mission high school");

			Thread.sleep(3000);
		}
		{
			WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Intermediate College Name']"));

			element1.sendKeys("sri chaitanya");

			Thread.sleep(3000);
		}
		{
			WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Engineering College Name']"));

			element1.sendKeys("pulla reddy engineering college");

			Thread.sleep(3000);
		}
		{
			WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'University Name']"));

			element1.sendKeys("JNTU");

			Thread.sleep(3000);
		}
		{
			WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Intermediate Percentage']"));

			element1.sendKeys("Intermediate Percentage");
			
			Thread.sleep(3000);
		}
		{
			WebElement element1 = driver.findElement(By.id("profession-0"));

			element1.click();

			Thread.sleep(3000);
		}

		// switch back to original browser(first window)

		driver.switchTo().window(winhandlebefore);

		Thread.sleep(3000);
	}

	/// do an action in previous window by entering the placeholder

	public static void service(WebDriver driver) throws InterruptedException

	{
		Actions action = new Actions(driver);

		WebElement element1 = driver.findElement(By.linkText("Services"));

		action.moveToElement(element1).build().perform();

		Thread.sleep(2000);

		WebElement element2 = driver.findElement(By.linkText("Performance Testing Services"));

		Thread.sleep(2000);

		element2.click();

		Thread.sleep(2000);
	}

}
