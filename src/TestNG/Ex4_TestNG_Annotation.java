package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex4_TestNG_Annotation
{
	@BeforeClass
	public void Openbrowser()
	{
		Reporter.log("--openbrowser--",true);
	}
	
	@BeforeMethod
	public void loginapp()
	{
		Reporter.log("--Loginapp--",true);
	}
	
	@Test
	public void verifyfullname()
	{
		Reporter.log("verifyfullname",true);
	}
	

	@Test
	public void verifyfullname2()
	{
		Reporter.log("verifyfullname2",true);
	}

	@AfterMethod
	public void logoutapp()
	{
		Reporter.log("--Logoutapp--",true);
	}
	

	@AfterClass
	public void Closebrowser()
	{
		Reporter.log("--Closebrowser--",true);
	}
}