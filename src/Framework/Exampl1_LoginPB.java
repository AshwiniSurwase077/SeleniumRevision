package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Exampl1_LoginPB 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeOptions op = new ChromeOptions();
op.addArguments("--disable-notifications");

WebDriver driver=new ChromeDriver();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[@class='sign-in']")).click();

driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9867175689");
Thread.sleep(2000);

driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashuuu777@");
Thread.sleep(2000);

driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
Thread.sleep(2000);

WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
Actions act=new Actions(driver);
act.moveToElement(myAcc).perform();
Thread.sleep(2000);

driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
Thread.sleep(2000);

//need to switch selenium focus from main page to child windows
Set<String> allIDs = driver.getWindowHandles();
ArrayList<String> al=new ArrayList(allIDs);
driver.switchTo().window(al.get(1));



String actFullName = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");

String expFullname = "Selena Gomez";

if( actFullName.equals( expFullname))
{
	System.out.println("TC PASS");
}
else
{
	System.out.println("TC FAIL");
}

Thread.sleep(2000);
driver.quit();















}
}
