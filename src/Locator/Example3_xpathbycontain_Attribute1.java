package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_xpathbycontain_Attribute1 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//enter un
	driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
	
	//enter pass
	driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
}
}
