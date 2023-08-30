package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBpwdPAge
{

@FindBy(xpath="//input[@type='password']")        private	WebElement PWD;
@FindBy(xpath="//a[@id='login-in-with-password']")      private	WebElement SignIn;

public PBpwdPAge(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void inpPBpwdPAgePWD()
{
	PWD.sendKeys("Ashuuu777@");
}

public void clickPBpwdPAgeSignIn()
{
	SignIn.click();
}
}
