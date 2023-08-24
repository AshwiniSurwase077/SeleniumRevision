package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_sendkeys
{
public static void main(String[] args) 
{	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nexas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
}
}
