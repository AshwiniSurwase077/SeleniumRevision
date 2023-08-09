package locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_index
{

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abs");
}
}
