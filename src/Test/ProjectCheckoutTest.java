package Test;

import org.testng.annotations.Test;

import Page.ProjectCheckoutPage;

public class ProjectCheckoutTest extends ProjectCartTest{
	@Test(priority=4)
	public void VerifyCheckout() throws Exception
	{
		ProjectCheckoutPage cp= new ProjectCheckoutPage(driver);
		Thread.sleep(25000);
		cp.Setvalues();
		cp.Region();
		Thread.sleep(4000);
		cp.Placeorder();
	}

}
