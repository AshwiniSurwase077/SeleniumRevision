package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_p0pup 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("101");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//get text from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		//OR
		//Alert alt = driver.switchTo().alert();
		//String text = alt.getText();
		//System.out.println(text);
		
		//click on ok button 
		driver.switchTo().alert().accept();
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		//Thread.sleep(2000);		
		//click on 2nd ok button
		
		driver.switchTo().alert().accept();
		
        
	}
}
