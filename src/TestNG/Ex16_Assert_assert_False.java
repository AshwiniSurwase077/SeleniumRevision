package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex16_Assert_assert_False
{
	@Test
	public void TC1() 
	{
		boolean actResult=true;
		Assert.assertTrue(actResult,"Failed-act result is false:    ");
	}
}
