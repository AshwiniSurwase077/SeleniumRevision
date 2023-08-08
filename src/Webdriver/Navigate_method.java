package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(2000);

driver.navigate().forward();   //move forword

driver.navigate().to("https://www.youtube.com/watch?v=e_tqsqcSkKk");
Thread.sleep(2000);

driver.navigate().back();          //move back
driver.navigate().refresh();       //refresh

driver.manage().window().maximize();
Thread.sleep(2000);

driver.close();
}
}
