package Hard_Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoFt_Assert {

	@Test
	public void m1()
	{
		SoftAssert s = new SoftAssert();
				
		String actualstr = "Velocity";
		String expectedstr = "Velocity1";
		s.assertEquals(actualstr, expectedstr);
		
		String actualstr1 = "Velocity";
		String expectedstr1 = "Velocity1";
		s.assertNotEquals(actualstr, expectedstr);
		
		boolean actual = true;
		s.assertFalse(actual);
		
		boolean actual1 = true;
		s.assertTrue(actual1);
		
		s.assertAll();
	}
}
