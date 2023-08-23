package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex8_enable 
{     //if you want to skip method/test case then we need to use 
	  @Test(enabled=false)
	  public void TC1()
	  {
		  Reporter.log("run TC1",true);
	  }
	  
	  @Test
	  public void TC2()
	  {
		  Reporter.log("run TC2",true);
	  }
}
