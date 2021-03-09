package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_Login_Success 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 5: You land the dashboard when you login using username “admin” and password “admin123”");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
	
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);		
		
		String str = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/header[1]/div[1]/ohrm-navbar[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]")).getText();
		System.out.println(str);
		
		Thread.sleep(2000);
		//driver.close();

	}

}
