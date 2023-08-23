package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");

driver.findElement(By.xpath("input[@type='text']")).sendKeys("oneplus");
}
}
