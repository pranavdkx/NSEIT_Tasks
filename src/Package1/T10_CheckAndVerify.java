package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T10_CheckAndVerify 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 10: Click “Baseball” and “Basketball” check boxes, then click on “Save”. \n "
				+ "Then click “Jobs” on topnav and then again click “Personal Details” on topnav. \n"
				+ "Scroll down to “Preferences” section again and verify that “Baseball” and “Basketball” are checked.");
		
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
		try
		{
		System.out.println("Clicking Jobs My info tab");
		driver.findElement(By.className("my_info")).click();
				
		System.out.println("Checking Baseball");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[2]/div[1]/custom-fields-panel[1]/div[2]/form[1]/materializecss-decorator[2]/div[1]/sf-decorator[1]/div[1]/div[1]/label[1]")).click();
		
		System.out.println("Checking Basketball");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[2]/div[1]/custom-fields-panel[1]/div[2]/form[1]/materializecss-decorator[2]/div[1]/sf-decorator[1]/div[1]/div[2]/label[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/header[1]/div[1]/nav[1]/div[1]/div[1]/ul[3]/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/header[1]/div[1]/nav[1]/div[1]/div[1]/ul[3]/li[1]/a[1]")).click();
		Thread.sleep(3000);
		
		
		if(driver.findElement(By.id("15Baseball")).isSelected())
		{
			System.out.println("Baseball checkbox is selected.");
		}
		if(driver.findElement(By.id("15Basketball")).isEnabled())
		{
			System.out.println("Basketball checkbox is selected.");
		}
		
		driver.close();
		}
		catch (Exception e) 
		{
			System.out.println("ERROR: "+e.getMessage());
		}
		finally 
		{
			driver.close();
		}
		
	}
}
