package Handling_of_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_select_checkboxes
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.get("file:///E:/Html/multipleCheckboxes.html");

List<WebElement> alllinks = driver.findElements(By.xpath("//input[@type='checkbox']"));

for(WebElement link:alllinks)
{
	link.click();
	Thread.sleep(500);
}
for(int i=alllinks.size()-1; i>=0; i--)
{
	alllinks.get(i).click();
	Thread.sleep(500);
}
}
}
