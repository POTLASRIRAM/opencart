package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword extends BaseClass {

	public ForgotPassword(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//Locators
	
	By forgotPassword = By.xpath("//div[@class='mb-3']//a[normalize-space()='Forgotten Password']");
	By cont = By.xpath("//button[@type='submit']");
	
	
	//Action Methods
	
	public void forgot_password() {
		driver.findElement(forgotPassword).click();
		
	}
	
	public void click_continue() {
		driver.findElement(cont).click();
		
	}
	
	public String alrt_message() {
		Alert alrt = driver.switchTo().alert();
		String message = alrt.getText();
		return message;
	}

	

}
