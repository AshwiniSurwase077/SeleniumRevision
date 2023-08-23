package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex7_priority1 
{
	//it excuted by default in assending order
	  @Test(priority=1)
	  public void TC4()
	  {
		  Reporter.log("run TC4",true);
	  }

@Test(priority=2)
public void TC3()
{
	  Reporter.log("run TC3",true);
}

@Test(priority=3)
public void TC2()
{
	  Reporter.log("run TC2",true);
}

@Test(priority=4)
public void TC1()
{
	  Reporter.log("run TC1",true);
}
}
