package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass{
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	
	By myAccount = By.xpath("//span[normalize-space()='My Account']");
	By register = By.xpath("//a[normalize-space()='Register']");
	By login = By.xpath("//a[normalize-space()='Login']");
	
	//Action methods
	
	public void clickmy_Account() {
	     driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	}
	public void clickRegister() {
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	

}
