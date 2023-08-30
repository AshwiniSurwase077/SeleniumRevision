package CustmiZed_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(3000);
	
	//step1: 
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions act=new Actions(driver);
		act.click(month).perform();
		
		//use to navigate 1st option(jan)
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		
		for(int i=1; i<=10; i++)
		{
			act.sendKeys(Keys.DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
}
}
