package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount1 {

	@Test (invocationCount=1)
	 public void m2()
	 {
		Reporter.log("Running Test casse2",true);
	 }
	
	@Test (invocationCount=2)
	  public void m3() 
	  {
		Reporter.log("Running Test Case3",true);
	  }
}
