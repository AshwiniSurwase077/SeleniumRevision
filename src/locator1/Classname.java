package locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname 
{

public static void main(String[] args) throws InterruptedException 
{	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nexas\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	//tagname not work bcz of their multiple matching are thier.
	//if single element will be present their then it will work
	
	driver.findElement(By.className("inputtext")).sendKeys("ddd");
}

}
