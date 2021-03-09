package Package1;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T9_ScrollAndCheckBoxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 9: Click on “Personal Details” on the top, scroll to “Preferences” section at bottom. \n"
				+ " Ensure that “Baseball”, “BasketBall”, “Football” and “Handball” checkboxes are available. ");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[3]/a[1]/span[2]")).click();
		Thread.sleep(4000);		
		
		//WebElement firstName = driver.findElement(By.id("firstName"));
		//if( firstName.isDisplayed())
		//{
			//Thread.sleep(2000);		
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,500)");
		
		//}
		if(driver.findElement(By.id("15Baseball")).isEnabled())
		{
			System.out.println("Baseball checkbox is displayed.");
		}
		if(driver.findElement(By.id("15Basketball")).isEnabled())
		{
			System.out.println("Basketball checkbox is displayed.");
		}
		if(driver.findElement(By.id("15Football")).isEnabled())
		{
			System.out.println("Football checkbox is displayed.");
		}
		if(driver.findElement(By.id("15Handball")).isEnabled())
		{
			System.out.println("Handball checkbox is displayed.");
		}
		
		driver.close();
		
	}
}
