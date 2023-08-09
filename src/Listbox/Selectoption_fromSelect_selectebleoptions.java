package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectoption_fromSelect_selectebleoptions 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);


driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
Thread.sleep(3000);
WebElement selectmonth=driver.findElement(By.xpath("//select[@title='Month']"));
Select s=new Select(selectmonth);
s.selectByVisibleText("Jan");
s.selectByIndex(0);
s.selectByValue("1");




}
}
