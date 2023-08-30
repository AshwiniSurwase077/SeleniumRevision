package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogout
{

@FindBy(xpath="//div[@class='pull-right']")private WebElement logout;

public PBLogout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickPBlogoutlogout()
{
	logout.click();
}
}
