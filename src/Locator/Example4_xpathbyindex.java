package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_xpathbyindex 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//Thread.sleep(3000);
	
	//click om create new account link
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
	
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
	
}
}
