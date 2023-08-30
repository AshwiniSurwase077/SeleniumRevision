package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

//
//public String getPBMyprofilePageFullname()
//{
//	String actfullname = fullname.getAttribute("value");
//	return actfullname;
//}

public void VerifyPBMyprofilePagefullnam(String expfullname)
{
	String actfullName = fullname.getAttribute("value");
	

	if(actfullName.equals(expfullname))
	{
		System.out.println("TC PASS");
	}
	else
	{
		System.out.println("TC FAIl");
	}
}
}
