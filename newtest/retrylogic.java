package newe.newtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retrylogic {
	
	@Test(retry = retryanalyser.class)
	public void tc1() 
	{
		Assert.assertTrue(false);
	}
	public void tc2() 
	{
		Assert.assertTrue(false);
	}

	public void tc3() 
	{
		Assert.assertTrue(true);
	}
	

}
