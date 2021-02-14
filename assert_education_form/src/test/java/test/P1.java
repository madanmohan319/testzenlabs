package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.google.errorprone.annotations.Var;

public class P1 {
	public static void Primary_School(WebDriver driver) throws InterruptedException

	
	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Primary School Name']"));

		element1.sendKeys("model mission high school");

		Thread.sleep(3000);

}
	
	public static boolean Primary_School_Validate(WebDriver driver) throws InterruptedException

	{
	
			
       driver.findElement(By.cssSelector("input[placeholder= 'Primary School Name']")).isSelected();
	
			            return true;         
			}
  
	public static void Secondary_School(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Secondary School Name']"));

		element1.sendKeys("model mission high school");

		Thread.sleep(3000);
	}
	
	public static boolean Secondary_School_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Secondary School Name']")).isSelected();
		
	     return true;
		        
		  
		}

	public static void Intermediate(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Intermediate College Name']"));

		element1.sendKeys("sri chaitanya");

		Thread.sleep(3000);
	}
	public static boolean Intermediate_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Intermediate College Name']")).isSelected();
		
	     return true;
		        
		  
		}
	public static void Engineering(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Engineering College Name']"));

		element1.sendKeys("pulla reddy engineering college");

		Thread.sleep(3000);
	}
	
	public static boolean Engineering_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'Engineering College Name']")).isSelected();
		
	     return true;
		        
		  
	}

	public static void University(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'University Name']"));

		element1.sendKeys("JNTU");

		Thread.sleep(3000);
	}
	
	public static boolean University_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.cssSelector("input[placeholder= 'University Name']")).isSelected();
		
	     return true;
		        
		  
}
	public static void intermediate_Percentage(WebDriver driver) throws InterruptedException

	{
		
		WebElement element1 = driver.findElement(By.id("continents-selectized"));
		element1.click();
		Thread.sleep(2000);
		element1.sendKeys("Intermediate Percentage");
		Thread.sleep(2000);
		element1.click();
	}
		

	
	public static boolean intermediate_Percentage_Validate(WebDriver driver) throws InterruptedException

	{
		        
		driver.findElements(By.id("continents-selectized")).get(0).isSelected();
			
		return true;
		         	
}
		
	
	public static void range_1(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.id("myRange4")); 
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
        
        action.clickAndHold(element1).moveByOffset(100, 50).release().build().perform();
        
	}
	
	
	public static boolean range_1_Validate(WebDriver driver) throws InterruptedException

{
			
			List<WebElement> text = driver.findElements(By.id("demo4"));
			
			
			for (WebElement product : text)
		    {
		        if (product.getText().equals("100"))
		        	
		            return true;
		         
		}
			return false;

}
	
	
	public static void Engineering_Percentage(WebDriver driver) throws InterruptedException

	{
		List<WebElement> element1 = driver.findElements(By.id("continents-selectized"));
		
		element1.get(1).click();
		element1.get(1).sendKeys("Engineering Percentage");
		element1.get(1).click();
	}
		

	
	public static boolean Engineering_Percentage_Validate(WebDriver driver) throws InterruptedException

	{
		        
		driver.findElements(By.id("continents-selectized")).get(1).isSelected();
			
		return true;
		         	
}
	
	public static void range_2(WebDriver driver) throws InterruptedException

	{
        
       
       WebElement element1 = driver.findElement(By.id("myRange"));
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
        
        action.clickAndHold(element1).moveByOffset(100, 50).release().build().perform();
	}
	
	
	public static boolean range_2_Validate(WebDriver driver) throws InterruptedException

{
			
			List<WebElement> text = driver.findElements(By.id("demo"));
			
			
			for (WebElement product : text)
		    {
		        if (product.getText().equals("100"))
		        	
		            return true;
		         
		}
			return false;

}
	public static void University_Percentage(WebDriver driver) throws InterruptedException

	{
		List<WebElement> element1 = driver.findElements(By.id("continents-selectized"));
		
		element1.get(2).click();
		element1.get(2).sendKeys("University Percentage");
		element1.get(2).click();
	}
		

	
	public static boolean University_Percentage_Validate(WebDriver driver) throws InterruptedException

	{
		        
		driver.findElements(By.id("continents-selectized")).get(2).isSelected();
			
		return true;
		         	
}
		
	public static void range_3(WebDriver driver) throws InterruptedException

	{
        
       
       WebElement element1 = driver.findElement(By.id("myRange2"));
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
        
        action.clickAndHold(element1).moveByOffset(100, 50).release().build().perform();
	}
	
	
	public static boolean range_3_Validate(WebDriver driver) throws InterruptedException

{
			
			List<WebElement> text = driver.findElements(By.id("demo2"));
			
			
			for (WebElement product : text)
		    {
		        if (product.getText().equals("100"))
		        	
		            return true;
		         
		}
			return false;

}
	
	
	public static void MR(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.id("profession-0"));

		element1.click();

		Thread.sleep(3000);
	}
	
	public static boolean MR_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.id("profession-0")).isSelected();
		
	     return true;
		        
		  
		}
	public static void education(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.linkText("Education in India"));

		element1.click();

		Thread.sleep(3000);
	}
	public static boolean education_Validate(WebDriver driver) throws InterruptedException

	{
	
			
		driver.findElement(By.linkText("Education in India")).isSelected();
		
	     return true;
		        
		  
		}
}
