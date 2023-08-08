package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

Thread.sleep(2000);
driver.get("https://www.youtube.com/watch?v=VjXQP9Jdp-E");
}
}
