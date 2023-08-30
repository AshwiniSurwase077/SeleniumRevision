package POM_DDF_TestNG_BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass  
{
	 WebDriver driver;
public void initialization_browser() throws InterruptedException
{
	
		
	  driver=new ChromeDriver();
	  driver.get("https://www.policybazaar.com/");
	  driver.manage(). timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
}
}
