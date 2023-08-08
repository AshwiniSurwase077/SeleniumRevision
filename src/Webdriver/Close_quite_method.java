package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_quite_method 
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.close();   //use to close the current tab only
driver.quit(); //use to close the all tab which is open on browser
}
}
