package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority2 {

	@Test
	 public void m1 ()
	 {
		Reporter.log("Running Test case 1", true);
	 }
	
	@Test (priority=1)
	public void m2 ()
	{
		Reporter.log("Running Test Case 2", true);
	}
}
