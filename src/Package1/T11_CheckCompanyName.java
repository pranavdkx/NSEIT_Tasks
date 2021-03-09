package Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T11_CheckCompanyName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 11: Click on HR’s name on top left, then click on “About”. Ensure that the “company name” \n"
				+ "in dialog is “Company Name: OrangeHRM (Pvt) Ltd(Parallel Demo)”");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);		
		
		driver.findElement(By.id("user-dropdown")).click();
		driver.findElement(By.id("aboutDisplayLink")).click();
		
		//Alert a = driver.switchTo().alert();
		//System.out.println(a.getText());
		
		//driver.switchTo().frame("About");
		driver.switchTo().activeElement();
		
		String Company = driver.findElement(By.cssSelector("div.modal.beaconDisplayAbout.open:nth-child(9) div.modal-content.customized-modal-content form:nth-child(1) div.modal-body div:nth-child(1) div.row > div.col.s12:nth-child(1)")).getText();
		System.out.println(Company);
		
		
	}
}
