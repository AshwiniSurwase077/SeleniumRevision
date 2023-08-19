package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Setup.S1;

public class Is_multiple {

	public static void main(String[] args) throws InterruptedException
	{
        S1.setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Html/mltiple.html");

		Thread.sleep(2000);

		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));

		Select s = new Select(selectCountry);

		boolean result = s.isMultiple();

		System.out.println(result);

	}

}
