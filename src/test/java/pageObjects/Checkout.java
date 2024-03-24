package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout extends BaseClass{

	public Checkout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By validate_checkout = By.xpath("//h1[normalize-space()='Checkout']");
	
	//Test2
	By billing_newaddress = By.xpath("//input[@value='new']");
	By billing_cont = By.xpath("//input[@id='button-payment-address']");
	By error_warnings = By.xpath("//*[@id=\"payment-new\"]/div[1]/div/div");
	
	
	//Action methods
	//Test2
	public void test2_select_billing_new_address() {
		driver.findElement(billing_newaddress).click();
	}
	public void test2_click_billing_continue() {
		driver.findElement(billing_cont).click();
	}
	public boolean test2_ret_errormsg_otpt() {
		boolean output = false;
		String error = driver.findElement(error_warnings).getText();
		if(error.equalsIgnoreCase("First Name must be between 1 and 32 characters!")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	
	//Test1
	public boolean test1_ret_checkoutres() {
		boolean otpt = false;
		String checkot = driver.findElement(validate_checkout).getText();
		if(checkot.equals("Checkout")) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}
	
	

}
