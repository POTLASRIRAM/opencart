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
	
	By forgotPassword = By.xpath("//div[@class='form-group']//a[normalize-space()='Forgotten Password']");
	By email_placeholder = By.xpath("//*[@placeholder=\"E-Mail Address\"]");
	By cont = By.xpath("//input[@value='Continue']");
	
	
	//Action Methods
	
	public void forgot_password() {
		driver.findElement(forgotPassword).click();
		
	}
	public void email_placeholder() {
		
		String placeholder=driver.findElement(email_placeholder).getAttribute("placeholder");
		System.out.println("Placeholder : "+placeholder);
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
