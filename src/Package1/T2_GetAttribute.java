package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_GetAttribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 2: The username field has type “text” and password field has type “password”.");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		String s1 = driver.findElement(By.id("txtUsername")).getAttribute("type");			
		System.out.println("Username textbox has type:"+ s1);
		
		String s2 = driver.findElement(By.id("txtPassword")).getAttribute("type");
		System.out.println("Password textbox has type:"+ s2);
		
		Thread.sleep(2000);
		driver.close();

	}

}
