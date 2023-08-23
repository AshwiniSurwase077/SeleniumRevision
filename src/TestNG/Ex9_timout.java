package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex9_timout
{     @Test
	  public void TC1()
	  {
		  Reporter.log("run TC1",true);
	  }
	  
	  @Test(timeOut=5000)
	  public void TC2() throws InterruptedException
	  { 
		  Thread.sleep(8000);
		  Reporter.log("run TC2",true);
	  }
}
