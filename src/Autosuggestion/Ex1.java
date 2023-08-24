package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
	Thread.sleep(2000);
	
	String exptext="redmi note 12";
	
	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	
	for(WebElement options:alloptions)
	{
		String acttext = options.getText();
		if(acttext.equals(exptext))
		{
			options.click();
			break;
		}
	}
	
}
}
