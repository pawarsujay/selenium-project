package Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1 {

	@Test (groups="sanity")
	  public void m1()
	  {
		Reporter.log("Running test case1",true); 
		}
	@Test (groups= {"Regression,sanity"})
	  public void m2()
	  {
		Reporter.log("Running test case2",true); 
		}
	@Test (groups="sanity")
	  public void m3()
	  {
		Reporter.log("Running test case3",true); 
		}
	@Test (groups="sanity")
	  public void m4() 
	  {
		
		Reporter.log("Running test case4",true); 
		}
	@Test (groups="Regression")
	  public void m5()
	  {
		
		Reporter.log("Running test case5",true); 
		}
	@Test (groups="Regression")
	  public void m6()
	  {
		Reporter.log("Running test case6",true); 
		}
}
