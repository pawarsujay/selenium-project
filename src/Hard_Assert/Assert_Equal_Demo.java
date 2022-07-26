package Hard_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Equal_Demo {

	@Test
	public void m1()
	{
		String actualResult = "Good Morning";
		String expectedResult = "Good Morni";
		Assert.assertEquals(actualResult, expectedResult,"Failed due to both values are different  ");
	}
}
