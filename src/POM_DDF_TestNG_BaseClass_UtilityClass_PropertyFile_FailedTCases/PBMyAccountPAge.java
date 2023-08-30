package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccountPAge 
{

@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;


public  PBMyAccountPAge(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void clickPBMyAccountPAgeMyProfile()
{
	MyProfile.click();
}
}
