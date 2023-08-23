package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_invocationcount 
{
  @Test(invocationCount = 3)
  public void TC1()
  {
	  Reporter.log("run TC1");
  }
  
}
