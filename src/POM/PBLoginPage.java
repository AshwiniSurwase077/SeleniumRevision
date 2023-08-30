package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage
{
      //declation
      @FindBy(xpath="//a[@class='sign-in']") private WebElement signIn;
      
      //intialization
      public PBLoginPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }

      
      //usage
      public void clickPBLoginPageSignInBtn()
      {
    	  signIn.click();
    	  
      }
}
