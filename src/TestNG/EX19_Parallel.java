package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EX19_Parallel 
{

	  @Test

		public void name() throws InterruptedException
		{
		  WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");

			Thread.sleep(2000);
			
			driver.close();	
			
		}
	  	
}
