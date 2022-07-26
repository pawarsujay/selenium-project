package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout1 {

	@Test(timeOut=2000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(4000);
		Reporter.log("Running test case 1",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("Running test case 2",true);
	}

}
