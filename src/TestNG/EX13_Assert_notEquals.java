package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EX13_Assert_notEquals
{
	  @Test
	  public void TC1() 
	  {
		  String actresult = "hi";
		  String expresult = "hellow";
		  Assert.assertNotEquals(actresult,expresult,"faliled both  are diffrent;");
	  }
}
