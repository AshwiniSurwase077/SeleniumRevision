package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

//switch selenium focus main to child page
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();

//switch selenium focus child to main
driver.switchTo().parentFrame();
driver.findElement(By.xpath("//a[@id='menuButton']")).click();
}
}
