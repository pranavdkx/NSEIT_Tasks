package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Invalid_Credentials 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 4: You receive a notification “Invalid Credentials” when you login using username “admin” and password “admin”.");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		String error = driver.findElement(By.className("toast-message")).getText();
		System.out.println("Error:"+ error);
		
		Thread.sleep(2000);
		driver.close();

	}
}
