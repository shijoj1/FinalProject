package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProjectProductPage {
	WebDriver driver;
	
	By Product=By.xpath("/html/body/div[2]/header/div[1]/div[2]/div/div/div[3]/div/ul/li[3]/a");
	By Category=By.xpath("/html/body/div[2]/header/div[1]/div[2]/div/div/div[3]/div/ul/li[3]/div[2]/div/ul/li[8]/a");
	By Selection=By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div/ol/li[4]/div/div/strong/a");
	By Addtocart=By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[2]/div[4]/form/div/div/div[2]/button");

	public ProjectProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void Product()
	{
		Actions a= new Actions(driver);
		WebElement w= driver.findElement(Product);
		a.moveToElement(w).perform();
	}
	public void Click()
	{
		driver.findElement(Category).click();
		driver.findElement(Selection).click();
		driver.findElement(Addtocart).click();
	}
}
