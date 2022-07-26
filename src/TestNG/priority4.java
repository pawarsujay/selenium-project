package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority4 {

	@Test (priority=1)
	public void m2()
	{
		Reporter.log("Running test case2",true);
	}
	
	@Test (priority=1)
	  public void m3()
	  {
		Reporter.log("Running test case3",true);
	  }
}
