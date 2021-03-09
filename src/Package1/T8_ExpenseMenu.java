package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8_ExpenseMenu 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Task 9: In the “Expense” menu on left navigation bar, the submenu items are \n “Configuration”, “Travel Requests”, “Claims” and “Reports”");
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
	
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_expense_viewExpenseModule")).click();
		
		if(driver.findElement(By.id("menu_expense_Configuration")).isDisplayed() )
		{
			System.out.println("Configuartion submenu item is displayed.");
		}
		if(driver.findElement(By.id("menu_expense_TravelRequests")).isDisplayed() )
		{
			System.out.println("Travel submenu item is displayed.");
		}
		if(driver.findElement(By.id("menu_expense_Claims")).isDisplayed() )
		{
			System.out.println("Claims submenu item is displayed.");
		}
		if(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[13]/div[1]/ul[1]/li[4]")).isDisplayed() )
		{
			System.out.println("Reports submenu item is displayed.");
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
