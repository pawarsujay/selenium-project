package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed_Tesr {

	@Test (priority=3)
	  public void m1()
	  {
		Reporter.log("Running test case1",true); 
		}
	@Test (priority=1)
	  public void m2()
	  {
		Reporter.log("Running test case2",true); 
		}
	@Test (priority=2)
	  public void m3()
	  {
		Reporter.log("Running test case3",true); 
		}
	@Test (priority =3 )
	  public void m4() throws InterruptedException
	  {
		
		Reporter.log("Running test case1",true); 
		}
	@Test (priority=1)
	  public void m5()
	  {
		Assert.fail();
		Reporter.log("Running test case2",true); 
		}
	@Test (priority=2)
	  public void m6()
	  {
		Reporter.log("Running test case3",true); 
		}
	
	
}
