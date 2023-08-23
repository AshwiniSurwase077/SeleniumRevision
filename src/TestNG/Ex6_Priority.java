package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex6_Priority 
{
	//it will excuted by default in assending order
  @Test
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
