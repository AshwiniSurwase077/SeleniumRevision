package Scrollup_Down;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
//Thread.sleep(2000);
//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
//Thread.sleep(2000);
//((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
//Thread.sleep(2000);
//((JavascriptExecutor)driver).executeScript("window.scrollBy(-100,0)");
//Thread.sleep(2000);


WebElement terms=driver.findElement(By.xpath("//a[text()='Terms']"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",terms);		
}
}
