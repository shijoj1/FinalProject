package Test;

import org.testng.annotations.Test;

import Base.ProjectBase;
import Page.ProjectSignupPage;

public class ProjectSignupTest extends ProjectBase {
	@Test
	public void VerifySignup() throws Exception
	{
		ProjectSignupPage sp= new ProjectSignupPage(driver);
		
		sp.icon();
		Thread.sleep(3000);
		sp.create();
		Thread.sleep(3000);
		sp.setvalues();
		sp.createaccount();
		
	}

}
