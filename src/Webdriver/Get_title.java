package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");

Thread.sleep(2000);


System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.close();
}
	
}

