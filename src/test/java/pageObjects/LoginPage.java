package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	
	By email = By.xpath("//input[@id='input-email']");
	By password = By.xpath("//input[@id='input-password']");
	By loginButton = By.xpath("//button[@type='submit']");
	
	//Action methods
	
	public void sendEmail(String user_email) {
		driver.findElement(email).sendKeys(user_email);
	}
	
	public void sendPassword(String user_pswd) {
		driver.findElement(password).sendKeys(user_pswd);
	}
	 public void clickLogin() {
		 driver.findElement(loginButton).click();
	 }

}
