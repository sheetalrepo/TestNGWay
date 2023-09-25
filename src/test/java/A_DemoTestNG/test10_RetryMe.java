package A_DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test10_RetryMe {

	int i = 0;
	
	@Test(retryAnalyzer = A_DemoTestNG.test10_RetryAnalyzer.class)
	public void Retry1()
	{
		//Assert.assertEquals(false, true);
		i++;
		Assert.assertEquals(i, 3);
/*		
		i++;
		System.out.println(i);
		if(i == 3){
			Assert.assertEquals(i, 3);
		}else {
			Assert.assertTrue(false);
		}
*/		
		
	}

	@Test
	public void Retry2()
	{
		Assert.assertEquals(false, true);
	}

}
