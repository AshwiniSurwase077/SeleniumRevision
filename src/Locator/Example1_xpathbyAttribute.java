package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_xpathbyAttribute
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");

	//driver.findElement("locator type");
	//driver.findelement(xpath("xpath xpression"));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
	
	
	
	
}
}
