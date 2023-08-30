package POM;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Notification.PBHomePage;

public class PBLoginTest 
{
public static void main(String[] args) throws InterruptedException 
{

WebDriver driver=new ChromeDriver();
driver.get("https://www.policybazaar.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
Thread.sleep(2000);

PBLoginPage login=new  PBLoginPage(driver);
login.clickPBLoginPageSignInBtn();
Thread.sleep(2000);

PBMobNumberPage mobnum=new PBMobNumberPage(driver);
mobnum.inpPBMobNumberPagemobnum();
mobnum.clickPBMobNumberloginwithpwd();
Thread.sleep(2000);

PBpwdPAge pwd=new PBpwdPAge(driver);
pwd.inpPBpwdPAgePWD();
pwd.clickPBpwdPAgeSignIn();
Thread.sleep(2000);

PBHomePage  home=new PBHomePage(driver);
home.openDDOptionPBHomePageMyAcc();
Thread.sleep(2000);

PBMyAccountPAge myacc=new PBMyAccountPAge(driver);
myacc.clickPBMyAccountPAgeMyProfile();
Thread.sleep(2000);

PBMyprofilePage mypro=new PBMyprofilePage(driver);
mypro.switchTochildwindow();
mypro.VerifyPBMyprofilePagefullnam();
Thread.sleep(2000);

PBlogout logout=new PBlogout(driver);
logout.clickPBlogoutlogout();
Thread.sleep(2000);

driver.quit();


}
}
