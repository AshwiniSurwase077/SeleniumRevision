package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_Xpath_bytext 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//click on forgotten password
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}
}
