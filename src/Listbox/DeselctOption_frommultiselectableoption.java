package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselctOption_frommultiselectableoption 
{
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new  ChromeDriver();
		driver.get("file:///D:/Daily%20Examples/Revision%20Session2/Selenium/Html%20Files/listbox.html");
		
			
		Thread.sleep(2000);
		
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(selectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		
		
		s.deselectByIndex(0);
		s.deselectByVisibleText("Sri");
		//s.deselectByValue(value);
		
	}

}
