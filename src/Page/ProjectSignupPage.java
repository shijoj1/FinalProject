package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectSignupPage {
WebDriver driver;
	
	By Icon=By.xpath("/html/body/div[2]/header/div[1]/div[2]/div/div/div[4]/div/ul[1]/li/a");
	By Create=By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a");
	
	By Firstname=By.name("firstname");
	By Lastname=By.name("lastname");
	By Email=By.name("email");
	By Password=By.name("password");
	By Confirmpassword=By.name("password_confirmation");
	By Createaccount=By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button");
	

	public ProjectSignupPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void icon() {
		driver.findElement(Icon).click();
	}
	public void create() {
		driver.findElement(Create).click();
	}
	public void setvalues()
	{
		driver.findElement(Firstname).sendKeys("Test");
		driver.findElement(Lastname).sendKeys("Project");
		driver.findElement(Email).sendKeys("testingdatasj@gmail.com");
		driver.findElement(Password).sendKeys("abcd@1234");
		driver.findElement(Confirmpassword).sendKeys("abcd@1234");
	}
	public void createaccount()
	{
		driver.findElement(Createaccount).click();
		}


}
