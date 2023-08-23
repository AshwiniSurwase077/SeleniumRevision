package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex12_Assert_assertequals1 
{
	  @Test
	  public void TC1() 
	  {
		  String actresult = "hi";
		  String expresult = "hellow";
		  Assert.assertEquals(actresult,expresult,"faliled both  are diffrent;");
	  }
}
