package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Notification.PBHomePage;
import POM.PBLoginPage;
import POM.PBMobNumberPage;
import POM.PBMyAccountPAge;
import POM.PBMyprofilePage;
import POM.PBlogout;
import POM.PBpwdPAge;

public class PBLogin_TestNg_Test1 extends BaseClass
{
	//declare gobally
	 PBLoginPage login;
	 PBMobNumberPage mobnum;
	 PBpwdPAge pwd;
	 PBHomePage  home;
	 PBMyAccountPAge myacc;
	 PBmyprofilePage  mypro;
	 PBlogout logout;
	 int   TCID;
	
	
	 
  @BeforeClass
  public void OPenBrowser() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  TCID=101;
	  initialization_browser();
	  
	  //initialize locally
	   login=new  PBLoginPage(driver);
	   mobnum=new PBMobNumberPage(driver);
	   pwd=new PBpwdPAge(driver);
	   home=new PBHomePage(driver);
	   myacc=new PBMyAccountPAge (driver);
	   mypro=new PBmyprofilePage (driver);
	   logout=new PBlogout(driver);
  }
  
  @BeforeMethod
  public void loginToApp() throws InterruptedException , EncryptedDocumentException, IOException 
  {
	  login.clickPBLoginPageSignInBtn();
	  Thread.sleep(2000);
	  mobnum.inpPBMobNumberPagemobnum(); 
	  mobnum.clickPBMobNumberloginwithpwd();
	  Thread.sleep(2000);
	  pwd.inpPBpwdPAgePWD();
	  pwd.clickPBpwdPAgeSignIn();
	  Thread.sleep(2000);
  }
  
  @Test
  public void VerifyFullname() throws InterruptedException, EncryptedDocumentException, IOException
  {
	  home.openDDOptionPBHomePageMyAcc();
	  Thread.sleep(2000);
	  myacc.clickPBMyAccountPAgeMyProfile();
	
	  mypro.switchTochildwindow();
	  //mypro.VerifyPBMyprofilePagefullnam();
	  
	  String actfullname=mypro.getPBMyprofilePageFullname();
      String expfullname=UtilityClass.getTestData(0, 2);
      
      Assert.assertEquals(actfullname, expfullname,"failed both are difff");
      Thread.sleep(2000);
	    
  }
  
 
 @AfterMethod
 public void logout(ITestResult s1) throws IOException,InterruptedException 
  {

	 if(s1.getStatus()==ITestResult.FAILURE)
	 {
		 UtilityClass.captureSS(driver, TCID);
	 }
	 Thread.sleep(2000);
	  logout.clickPBlogoutlogout();
	  Thread.sleep(2000);
  }

 @AfterClass
 public void closebrowser()
 {
	 driver.close();
 }
  
}
