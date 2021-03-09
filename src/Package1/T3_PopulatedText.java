package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_PopulatedText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 3: The username is pre-populated with “admin” and password is pre-populated with “admin123”.");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		String s1 = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println("Username textbox has input:"+ s1);
		
		String s2 = driver.findElement(By.id("txtPassword")).getAttribute("value");
		System.out.println("Password textbox has input:"+ s2);
		
		Thread.sleep(2000);
		driver.close();

	}
}
