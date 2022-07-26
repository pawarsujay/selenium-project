package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority3 {

	@Test (priority=1)
	 public void m2()
	 {
		Reporter.log("Running teas case1",true);
	 }
	
	@Test (priority=-2)
	public void m3()
	{
		Reporter.log("Running Test Case2",true);
	}
}
