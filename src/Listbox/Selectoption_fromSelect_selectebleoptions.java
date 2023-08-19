package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Setup.S1;

public class Selectoption_fromSelect_selectebleoptions extends S1
{
public static void main(String[] args) throws InterruptedException 
{
	S1.setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);


driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
Thread.sleep(3000);
WebElement selectmonth = driver.findElement(By.xpath("//select[@id='month']"));
Select s=new Select(selectmonth);
//s.selectByIndex(0);
s.selectByValue("2");
s.selectByVisibleText("feb");


}
}
