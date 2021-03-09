package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T7_PendingTasks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 7: There are five pending leave and 40 scheduled recruitment events on topnav right side.");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);	
		
		System.out.println("Checking pending tasks:");
		
		String str1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/dashboard-layout[1]/div[1]/widget-container[1]/div[1]/div[2]/span[1]/span[1]/my-actions-widget[1]/div[1]/div[1]/div[2]/span[1]/div[1]/span[1]/span[3]/div[1]/span[1]/span[1]/span[2]/span[1]/span[1]")).getText();
		System.out.println("Leave requests to approve: "+str1);
		
		String str2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/dashboard-layout[1]/div[1]/widget-container[1]/div[1]/div[2]/span[1]/span[1]/my-actions-widget[1]/div[1]/div[1]/div[2]/span[1]/div[1]/span[1]/span[3]/div[1]/span[2]/span[1]/span[2]/span[1]/span[1]")).getText();
		System.out.println("Time sheets to approve: "+str2);
		
		String str3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/dashboard-layout[1]/div[1]/widget-container[1]/div[1]/div[2]/span[1]/span[1]/my-actions-widget[1]/div[1]/div[1]/div[2]/span[1]/div[1]/span[1]/span[3]/div[1]/span[3]/span[1]/span[2]/span[1]/span[1]")).getText();
		System.out.println("Pending apprisals to review: "+str3);
		
		String str4 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/dashboard-layout[1]/div[1]/widget-container[1]/div[1]/div[2]/span[1]/span[1]/my-actions-widget[1]/div[1]/div[1]/div[2]/span[1]/div[1]/span[1]/span[3]/div[1]/span[4]/span[1]/span[2]/span[1]/span[1]")).getText();
		System.out.println("Goals to approve: "+str4);
		
		driver.close();
	}
}
