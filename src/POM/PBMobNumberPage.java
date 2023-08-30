package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumberPage
{

	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobnum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement loginwithpwd;
	
	public PBMobNumberPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void inpPBMobNumberPagemobnum()
	{
		mobnum.sendKeys("9867175689");
	}
	
	public void clickPBMobNumberloginwithpwd()
	{
		loginwithpwd.click();
	}


}
