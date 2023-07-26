package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class ProjectBase {
	public WebDriver driver;
	@BeforeClass
	
	public void setup()
	{

		driver=new FirefoxDriver();
		driver.get("https://www.vedagram.com");
		driver.manage().window().maximize();
	}

}
