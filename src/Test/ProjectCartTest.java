package Test;

import org.testng.annotations.Test;

import Page.ProjectCartPage;

public class ProjectCartTest extends ProjectProductTest {
	@Test(priority=3)
	public void VerifyCart() throws Exception
	{
		ProjectCartPage pc= new ProjectCartPage(driver);
		Thread.sleep(8000);
		pc.Click();
		Thread.sleep(6000);
		pc.Proceed();
	}

}
