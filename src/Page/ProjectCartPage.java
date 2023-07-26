package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectCartPage {
	WebDriver driver;
	By Proceed=By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div/ul/li[1]/button");

	public ProjectCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void Click()
	{
		driver.get("https://www.vedagram.com/checkout/cart/");
	}
	public void Proceed()
	{
		driver.findElement(Proceed).click();
	}
}
