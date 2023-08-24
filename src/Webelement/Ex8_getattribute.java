package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Setup.S1;

public class Ex8_getattribute extends S1
{
public static void main(String[] args) 
{
setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/\"");

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abs");

//print the Enter the user name
String value=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
System.out.println(value);
}
}
