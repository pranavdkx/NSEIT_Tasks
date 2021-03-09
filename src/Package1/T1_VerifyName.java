package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class T1_VerifyName 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 1: You find text “2005 - 2021 OrangeHRM, Inc. All rights reserved.” at the bottom of left pane on central object.");
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		System.out.println("Expected text: "+"2005 - 2021 OrangeHRM, Inc. All rights reserved.");
		
		String str = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]")).getText();
		System.out.println("Actual text: "+str);
		
		str = str.replaceAll("OrangeHRM 7.0\n©", "");			
		System.out.println("Modified text: "+str);
		
		Thread.sleep(2000);
		driver.close();

	}

}
