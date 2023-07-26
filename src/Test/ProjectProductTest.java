package Test;

import org.testng.annotations.Test;
import Page.ProjectProductPage;

public class ProjectProductTest extends ProjectLoginTest {
	@Test(priority=2)
	public void VerifyProduct()
	{
		ProjectProductPage pp= new ProjectProductPage(driver);
		
		pp.Product();
		pp.Click();
	}

}
