package Webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("file:///E:/Html/Webtable.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.manage().window().maximize();

//rowSize
List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
//System.out.println(allRows.size());
//
//List<WebElement> allcols = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th"));
//System.out.println(allcols.size());

//String value = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[1]")).getText();
//System.out.println(value);
for(int i=1; i<=allRows.size(); i++)
{
	System.out.println();
}

}
}
