package Practice_Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B_TestNG_TestClass {

	@Test
	public void TC0()
	{
	System.out.println("Running Test Case 0");
	}
	//Scenario 2 : Use of Reporter.log(, true);
	@Test
	public void TC1()
	{
	Reporter.log("Running TC1", true);
	}
	//Scenario 3 : Use of Reporter.log(, false/ Null);
	@Test
	public void TC2()
	{
	Reporter.log("Running TC2", false);
	}
	@Test
	public void TC3()
	{
	Reporter.log("Running TC3", true);
	}
	@Test
	public void TC4()
	{
	Reporter.log("Running TC4" );
	}
	
	
}
