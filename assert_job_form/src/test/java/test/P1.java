package test;

import java.awt.image.DataBufferByte;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class P1

{
	public static void Previous_Company_Name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Previous Company Name']"));

		element1.sendKeys("Archeesh");

		Thread.sleep(2000);

	}
	
	public static boolean Previous_Company_Name_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Previous Company Name']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void Current_Company_Name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Current Company Name']"));

		element1.sendKeys("null");

		Thread.sleep(2000);

	}

	public static boolean Current_Company_Name_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Current Company Name']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void bday_date(WebDriver driver) throws InterruptedException

	{
		List <WebElement> element = driver.findElements(By.name("bday"));
		   
	    Thread.sleep(2000);
	        
	       element.get(0).sendKeys("31/05/1993");
	       
	       Thread.sleep(2000);
		
	}
	
	public static boolean bday_date_Validate(WebDriver driver) throws InterruptedException

	{
		        
		driver.findElements(By.name("bday")).get(0).isSelected();
			
		return true;
		         	
}
		public static void previous_Join_Date(WebDriver driver) throws InterruptedException
		{
			
			List <WebElement> element = driver.findElements(By.name("bday"));
			   
			    Thread.sleep(2000);
			        
			       element.get(1).sendKeys("31/05/2017");
			       
			       Thread.sleep(2000);

			    }
		public static boolean previous_Join_Date_Validate(WebDriver driver) throws InterruptedException

		{
			        
			driver.findElements(By.name("bday")).get(1).isSelected();
				
			return true;
			         	
	}
		
		public static void Previous_Company_End_Date(WebDriver driver) throws InterruptedException

		{
			List <WebElement> element = driver.findElements(By.name("bday"));
			   
		    Thread.sleep(2000);
		        
		       element.get(2).sendKeys("31/05/2019");
		       
		       Thread.sleep(2000);
			
		}
		
		public static boolean Previous_Company_End_Date_Validate(WebDriver driver) throws InterruptedException

		{
			        
			driver.findElements(By.name("bday")).get(2).isSelected();
				
			return true;
			         	
	}
    			
		public static void current_Company_Join_Date(WebDriver driver) throws InterruptedException

		{
			List <WebElement> element = driver.findElements(By.name("bday"));
			   
		    Thread.sleep(2000);
		        
		       element.get(3).sendKeys("31/05/2020");
		       
		       Thread.sleep(2000);
			
		}
		
		public static boolean current_Company_Join_Date_Validate(WebDriver driver) throws InterruptedException

		{
			        
			driver.findElements(By.name("bday")).get(2).isSelected();
				
			return true;
			         	
	}

		public static void Experience_CLICK(WebDriver driver) throws InterruptedException

		{

			WebElement element1 = driver.findElement(By.name("exp"));

			element1.click();

			Thread.sleep(2000);

		}
		
		public static boolean Experience_CLICK_Validate(WebDriver driver) throws InterruptedException

		{
			        
			driver.findElement(By.name("exp")).isSelected();
				
			return true;
			         	
	}
		public static void QA_Web_Manual  (WebDriver driver) throws InterruptedException

		{

			WebElement element1 = driver.findElement(By.id("profession-0"));

			element1.click();

			Thread.sleep(2000);

		}
		
		public static boolean QA_Web_Manual_Validate(WebDriver driver) throws InterruptedException

		{
			        
			driver.findElement(By.id("profession-0")).isSelected();
				
			return true;
			         	
	}
		
		public static void QA_submit (WebDriver driver) throws InterruptedException

		{

		WebElement element1 = driver.findElement(By.linkText("Submit"));
			
			 Thread.sleep(2000);

			element1.click();

			Thread.sleep(2000);

		}
		public static boolean QA_submit_Validate(WebDriver driver) throws InterruptedException

		{
			        
			driver.findElement(By.linkText("Submit")).isSelected();
				
			return true;
			         	
	}
			
            }
