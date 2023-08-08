package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_xpathbylocator
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("dkldqwnkld");	
}
}
