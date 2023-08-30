package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBlogout 
{
@FindBy(xpath="//div[@class='pull-right']")private WebElement logout;

public PBlogout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickPBlogoutlogout()
{
	logout.click();
}
}
