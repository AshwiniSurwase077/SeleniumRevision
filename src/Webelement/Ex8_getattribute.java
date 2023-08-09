package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_getattribute
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/\"");

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abs");

//print the Enter the user name
String value=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
System.out.println(value);
}
}
