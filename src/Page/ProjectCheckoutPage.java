package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectCheckoutPage {
	
	WebDriver driver;
	By Address1=By.name("street[0]");
	By Address2=By.name("street[1]");
	By City=By.name("city");
	By Pincode=By.name("postcode");
	By State=By.name("region_id");
	By Company=By.name("company");
	By Phone=By.name("telephone");
	By Placeorder=By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[6]/div/button");
	
	
	public ProjectCheckoutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void Setvalues()
	{
		driver.findElement(Address1).sendKeys("Luminar");
		driver.findElement(Address2).sendKeys("Technolab");
		driver.findElement(City).sendKeys("Kochi");
		driver.findElement(Pincode).sendKeys("682003");
		driver.findElement(Company).sendKeys("LMR");
		driver.findElement(Phone).sendKeys("1234567890");
	}
	
	public void Region()
	{
		Select s= new Select(driver.findElement(State));
		s.selectByVisibleText("Kerala");
	}
	
	public void Placeorder()
	{
		driver.findElement(Placeorder).click();
	}
	

}
