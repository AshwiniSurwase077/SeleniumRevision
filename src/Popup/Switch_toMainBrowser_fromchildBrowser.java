package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switch_toMainBrowser_fromchildBrowser
{
public static void main(String[] args) throws InterruptedException 
{
	
	//---->New tab-->Traning-->back to home page-->click on NEw window
WebDriver driver=new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
Thread.sleep(2000);

//click on new tab from main page
driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
Thread.sleep(2000);

//get child window id
Set<String> allids = driver.getWindowHandles();
 ArrayList<String> al = new ArrayList(allids);
 String ChildwindowID=al.get(1);

//switch selnium focus from main to child window
driver.switchTo().window(ChildwindowID);

//click on teining on child window
driver.findElement(By.xpath("//span[text()='Training']")).click();

//back to home from child window
driver.switchTo().window(al.get(0));

//click on NEw Window
driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
Thread.sleep(2000);
driver.quit();
}
}
