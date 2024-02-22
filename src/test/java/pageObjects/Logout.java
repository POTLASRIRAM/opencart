package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends BaseClass{

	public Logout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	By logout = By.xpath("//a[normalize-space()='Logout']");
	By logout_conf = By.xpath("//h1[normalize-space()='Account Logout']");
	
	//Action methods
	
	public void logout() {
		driver.findElement(logout).click();
	}
	
	public boolean logoutConf() {
		String conf_msg = driver.findElement(logout_conf).getText();
		if(conf_msg.equals("Account Logout")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
