package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Downloads extends BaseClass{

	public Downloads(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By downloads = By.xpath("//a[@class='list-group-item'][normalize-space()='Downloads']");
	By downloadspagetext  = By.xpath("//p[contains(text(),'You have not made any previous downloadable orders')]");
	By cont  = By.xpath("//a[@class='btn btn-primary']");
	
	//Action methods
	public boolean test1_downloads() {
		boolean res = false;
		driver.findElement(downloads).click();
		String text = driver.findElement(downloadspagetext).getText();
		driver.findElement(cont).click();
		String currentpagetitle = driver.getTitle();
		if(currentpagetitle.equals("My Account") && text.matches("^[a-zA-Z].*$")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

}
