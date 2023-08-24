package Handling_of_multiple_elements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_tofectch_multipleElements 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

List<WebElement> alllinks = driver.findElements(By.xpath("//a"));

//we need to use for each loop for fetch the all links
for(WebElement link:alllinks)
{
	System.out.println(link.getText());
}
}
}
