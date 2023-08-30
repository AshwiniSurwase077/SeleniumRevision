package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Notification.PBHomePage;
import POM.PBLoginPage;
import POM.PBMobNumberPage;
import POM.PBMyAccountPAge;
import POM.PBMyprofilePage;
import POM.PBlogout;
import POM.PBpwdPAge;

public class PBLoginTest 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("E:\\Manual_Notes\\DDF.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.policybazaar.com/");
driver.manage(). timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
Thread.sleep(2000);

PBLoginPage login=new  PBLoginPage(driver);
login.clickPBLoginPageSignInBtn();
Thread.sleep(2000);

PBMobNumberPage mobnum=new PBMobNumberPage(driver);
String mobilenumber = sh.getRow(0).getCell(0).getStringCellValue();
mobnum.inpPBMobNumberPagemobnum();
mobnum.clickPBMobNumberloginwithpwd();
Thread.sleep(2000);

PBpwdPAge pwd=new PBpwdPAge(driver);
String password=sh.getRow(0).getCell(1).getStringCellValue();
pwd.inpPBpwdPAgePWD();
pwd.clickPBpwdPAgeSignIn();
Thread.sleep(2000);

PBHomePage  home=new PBHomePage(driver);
home.openDDOptionPBHomePageMyAcc();
Thread.sleep(2000);

PBMyAccountPAge myacc=new PBMyAccountPAge(driver);
myacc.clickPBMyAccountPAgeMyProfile();
Thread.sleep(2000);

PBmyprofilePage  mypro=new PBmyprofilePage (driver);
mypro.switchTochildwindow();
String expfullname = sh.getRow(0).getCell(2).getStringCellValue();
mypro.getPBMyprofilePageFullname();
Thread.sleep(2000);

PBlogout logout=new PBlogout(driver);
logout.clickPBlogoutlogout();
Thread.sleep(2000);

driver.quit();

}

}
