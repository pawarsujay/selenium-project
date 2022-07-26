package Hard_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NotEqual_Method {

	@Test
	  public void m2()
	  {
		String actualResult = "Good Morning";
		String expectedResult = "Good Morni";
		Assert.assertNotEquals(actualResult, expectedResult);
	  }
}
