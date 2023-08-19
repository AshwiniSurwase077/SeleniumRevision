package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Setup.S1;

public class SelectMultipleOption_FromMultiSelectedListbox
{

public static void main(String[] args) throws InterruptedException 
{
	S1.setup();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/Html/mltiple.html");
	Thread.sleep(2000);
	
	WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
	Select s=new Select(selectcountry);
	//s.selectByVisibleText("ind");
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
}
}
