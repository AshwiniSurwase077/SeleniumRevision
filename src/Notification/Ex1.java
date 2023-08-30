package Notification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1
{
public static void main(String[] args) 
{ChromeOptions op = new ChromeOptions();
op.addArguments("--disable-notifications");

WebDriver driver = new ChromeDriver(op);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.redbus.in/");	
}
}
