package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectLoginPage {
WebDriver driver;
	
	By Icon=By.xpath("/html/body/div[2]/header/div[1]/div[2]/div/div/div[4]/div/ul[1]/li/a");
	
	By Email=By.name("login[username]");
	By Password=By.name("login[password]");
	By Signin=By.name("send");
	

	public ProjectLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void click()
	{
		driver.findElement(Icon).click();
	}
	
	public void setvalues()
	{
		driver.findElement(Email).sendKeys("testingdatasj@gmail.com");
		driver.findElement(Password).sendKeys("abcd@1234");
	}
	
	public void signin()
	{
		driver.findElement(Signin).click();
	}


}
