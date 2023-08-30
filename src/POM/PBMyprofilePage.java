package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PBMyprofilePage 
{
@FindBy(xpath="//input[@name='personName']") private WebElement fullname;
WebDriver driver;

public PBMyprofilePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver= driver;
}

public  void switchTochildwindow()
{
	Set<String> allIds = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList(allIds);
	driver.switchTo().window(al.get(1));
}
public void VerifyPBMyprofilePagefullnam()
{
	String actfullName = fullname.getAttribute("value");
	String expfullName="Selena Gomez";
	
	if(actfullName.equals(expfullName))
	{
		System.out.println("TC PASS");
	}
	else
	{
		System.out.println("TC FAIl");
	}
}
//
//public String getPBMyprofilePageFullname()
//{
//	String actfullname = fullname.getAttribute("value");
//	return actfullname;
//}

}
