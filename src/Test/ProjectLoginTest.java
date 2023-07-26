package Test;

import org.testng.annotations.Test;

import Base.ProjectBase;
import Page.ProjectLoginPage;

public class ProjectLoginTest extends ProjectBase {
	@Test(priority=1)
	public void VerifyLogin() throws Exception
	{
		ProjectLoginPage pl=new ProjectLoginPage(driver);
		pl.click();
			pl.setvalues();
			Thread.sleep(4000);
			pl.signin();
		}
	}
