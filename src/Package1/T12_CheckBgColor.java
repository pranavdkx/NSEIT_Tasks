package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class T12_CheckBgColor 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Tas 12: Ensure that banner color of the dialog is “#00ac51”.");
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
		
		System.out.println("Expected Color code: #00ac51");
		
		String BgColor = driver.findElement(By.xpath("//h4[contains(text(),'About')]")).getCssValue("background-color");		
		System.out.println("Actual Color code: "+BgColor);
		
		String hex = Color.fromString(BgColor).asHex();
		System.out.println("Actual Color code in Hex : "+hex);
		
		
	}
}
