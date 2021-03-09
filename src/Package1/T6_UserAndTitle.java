package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6_UserAndTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 6: The logged in user’s name on left bar is “Jaqueline White” and title is “Global HR Manager”.");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");		
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);		
		
		String UserName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/span[1]")).getText();
		System.out.println("User name: "+UserName);
		
		String Role = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/span[2]")).getText();
		System.out.println("Role: "+Role);
		Thread.sleep(2000);
		driver.close();

	}

}
