package Static;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Static {
	public static void Primary_School(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Primary School Name']"));

		element1.sendKeys("model mission high school");

		Thread.sleep(3000);

	}

	public static void Secondary_School(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Secondary School Name']"));

		element1.sendKeys("model mission high school");

		Thread.sleep(3000);
	}

	public static void Intermediate(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Intermediate College Name']"));

		element1.sendKeys("sri chaitanya");

		Thread.sleep(3000);
	}

	public static void Engineering(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Engineering College Name']"));

		element1.sendKeys("pulla reddy engineering college");

		Thread.sleep(3000);
	}

	public static void University(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'University Name']"));

		element1.sendKeys("JNTU");

		Thread.sleep(3000);
	}

	public static void intermediate_Percentage(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Intermediate Percentage']"));

		element1.sendKeys("Intermediate Percentage");

		Thread.sleep(3000);
	}

	public static void MR(WebDriver driver) throws InterruptedException

	{
		WebElement element1 = driver.findElement(By.id("profession-0"));

		element1.click();

		Thread.sleep(3000);
	}
}
