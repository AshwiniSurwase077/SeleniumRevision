package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex14_Assert_notEquals 
{
	  @Test
	  public void TC1() 
	  {
		  String actresult = "hi";
		  String expresult = "hi";
		  Assert.assertNotEquals(actresult,expresult,"faliled both  are diffrent;");
	  }
}
