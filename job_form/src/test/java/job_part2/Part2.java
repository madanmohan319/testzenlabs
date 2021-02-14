package job_part2;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Part2

{
	public static void Previous_Company_Name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Previous Company Name']"));

		element1.sendKeys("Archeesh");

		Thread.sleep(2000);

	}

	public static void Current_Company_Name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Current Company Name']"));

		element1.sendKeys("null");

		Thread.sleep(2000);

	}

	public static void bday_Name(WebDriver driver) throws InterruptedException

	{
		List <WebElement> element = driver.findElements(By.name("bday"));
		   
	    Thread.sleep(2000);
	        
	       element.get(0).sendKeys("31/05/1993");
	       
	       Thread.sleep(2000);
		
	}
		public static void previous_Join_Date(WebDriver driver) throws InterruptedException
		{
			
			List <WebElement> element = driver.findElements(By.name("bday"));
			   
			    Thread.sleep(2000);
			        
			       element.get(1).sendKeys("31/05/2017");
			       
			       Thread.sleep(2000);

			    }
		public static void Previous_Company_End_Date(WebDriver driver) throws InterruptedException

		{
			List <WebElement> element = driver.findElements(By.name("bday"));
			   
		    Thread.sleep(2000);
		        
		       element.get(2).sendKeys("31/05/2019");
		       
		       Thread.sleep(2000);
			
		}			
    			
		public static void current_Company_Join_Date(WebDriver driver) throws InterruptedException

		{
			List <WebElement> element = driver.findElements(By.name("bday"));
			   
		    Thread.sleep(2000);
		        
		       element.get(3).sendKeys("31/05/2020");
		       
		       Thread.sleep(2000);
			
		}
		

		public static void Experience_CLICK(WebDriver driver) throws InterruptedException

		{

			WebElement element1 = driver.findElement(By.name("exp"));

			element1.click();

			Thread.sleep(2000);

		}
		public static void QA_Web_Manual  (WebDriver driver) throws InterruptedException

		{

			WebElement element1 = driver.findElement(By.id("profession-0"));

			element1.click();

			Thread.sleep(2000);

		}
		
		
		public static void QA_submit (WebDriver driver) throws InterruptedException

		{

		WebElement element1 = driver.findElement(By.linkText("Submit"));
			
			 Thread.sleep(2000);

			element1.click();

			Thread.sleep(2000);

		}
		
			
            }


		


