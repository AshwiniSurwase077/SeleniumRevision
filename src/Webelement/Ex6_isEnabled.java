package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_isEnabled 
{
public static void main(String[] args) 
{

	WebDriver driver=new  ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//checked that login button is enable/clickable or  not
	boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
	System.out.println(result);
	
		
}
}
