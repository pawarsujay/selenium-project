package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority1 {

	@Test (priority=3)
	 public void m1()
	 {
		Reporter.log("Test Case1 is execute",true);
	 }
	@Test (priority=1)
	public void m2()
	{
		Reporter.log("Test case2 is execute",true);
	}
	
	@Test (priority=2)
	  public void m3()
	  {
		Reporter.log("Test case3 is execute",true);
	  }
	
}
