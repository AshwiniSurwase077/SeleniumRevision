package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex11_Asserclass_Assertequals
{
  @Test
  public void TC1() 
  {
	  String actresult = "hi";
	  String expresult = "hi";
	  Assert.assertEquals(actresult,expresult,"faliled both  are diffrent;");
  }
}
