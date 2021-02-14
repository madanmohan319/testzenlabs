package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1 {

	public static void first_name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Name']"));

		element1.sendKeys("madan");

		Thread.sleep(2000);

	}

	public static boolean first_name_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Your Name']")).isSelected();
		
	     return true;
		        
		  
		}
	
	public static void Middle_Name(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Middle Name']"));

		element1.sendKeys("mohan");

		Thread.sleep(2000);

	}
	public static boolean Middle_Name_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Your Middle Name']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void Last_Name(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Last Name']"));

		element1.sendKeys("reddy");

		Thread.sleep(2000);

	}
	public static boolean Last_Name_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Your Last Name']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void phone_number(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Phone Number']"));

		element1.sendKeys("0899679102");

		Thread.sleep(2000);

	}
	public static boolean phone_number_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Phone Number']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void Address_One(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Address']"));

		Thread.sleep(2000);

		element1.sendKeys("Flat no 2, kingsmill court");

		Thread.sleep(2000);
	}
	public static boolean Address_One_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Your Address']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void Address_Two(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Address Two']"));

		Thread.sleep(2000);

		element1.sendKeys("bolton street");

		Thread.sleep(2000);
	}
	public static boolean Address_Two_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Your Address Two']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void pin_code(WebDriver driver) throws InterruptedException

	{

		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Pin Code']"));

		Thread.sleep(2000);

		element1.sendKeys("6162");

		Thread.sleep(2000);
	}
	
	public static boolean pin_code_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Your Pin Code']")).isSelected();
		
	     return true;
		        
		  
		}
	

	public static void continent(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Asia']"));

		element1.sendKeys("Europe");

		Thread.sleep(2000);

	}
	
	public static boolean continent_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Asia']")).isSelected();
		
	     return true;
		        
		  
		}
	
	public static void Male (WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.id("profession-0"));

		element1.click();

	}
	

	public static boolean Male_validate (WebDriver driver) throws InterruptedException

	{
		 driver.findElement(By.id("profession-0")).isSelected();
		
     return true;
	}
	
	public static void Major(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.id("exp-1"));

		element1.click();

	}
	
	public static boolean Major_validate (WebDriver driver) throws InterruptedException

	{
		 driver.findElement(By.id("exp-1")).isSelected();
		
     return true;
	}
	
	
	public static void Formerly_Registered(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.linkText("Formerly Registered"));

		element1.click();

	}
	
	public static boolean Formerly_Registered_validate (WebDriver driver) throws InterruptedException

	{
		 driver.findElement(By.linkText("Formerly Registered")).isSelected();
		
     return true;
	}
	
	
	public static void choose_file(WebDriver driver) throws InterruptedException
	
	{
		
		WebElement element1 = driver.findElement(By.id("photo"));
		Thread.sleep(2000);
		element1.sendKeys("/Users/madan mohan reddy/Desktop/123.jpg");
        Thread.sleep(2000);
        
	}

	public static boolean choose_file_validate (WebDriver driver) throws InterruptedException

	{
		 driver.findElement(By.id("photo")).isSelected();
		
     return true;
	}
	
	

}

