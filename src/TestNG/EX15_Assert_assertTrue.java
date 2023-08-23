package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EX15_Assert_assertTrue 
{  
	
	//we expect true but actresult is false so thats why testcase failed
	@Test
	public void TC1() 
	{
		boolean actResult=false;
		Assert.assertTrue(actResult,"Failed-act result is false:    ");
	}
}
